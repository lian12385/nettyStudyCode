package com.nettyJuc.day19;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Acceptor implements Runnable{
    private final ServerSocketChannel serverChannel;//这里我们在注册时丢了一个附加对象进去，这个附加对象会在选择器选择到此通道上时，可以通过
    private final Selector selector;
    public Acceptor(ServerSocketChannel serverChannel, Selector selector) {
        this.serverChannel = serverChannel;
        this.selector = selector;
    }
    @Override
    public void run() {
        try{
            SocketChannel channel = serverChannel.accept();
            System.out.println("客户端已连接，IP地址为："+channel.getRemoteAddress());
                    channel.configureBlocking(false);
//这里在注册时，创建好对应的Handler，这样在Reactor中分发的时候就可以直接调用Handler了
            channel.register(selector, SelectionKey.OP_READ, new
                    Handler(channel));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
package com.nettyJuc.MyThread;

public class stopThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            Thread me = Thread.currentThread();   //获取当前线程对象
            for (int i = 0; i < 50; i++) {
                System.out.println("打印:"+i);
                if(i == 20) me.stop();  //此方法会直接终止此线程
            }
        });
        t.start();
    }
}

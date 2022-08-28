package com.nettyJuc.day21;

public class test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("线程开始运行！");
            while (true){
                if(Thread.currentThread().isInterrupted()){   //判断是否存在中断标志
                    System.out.println("发现中断信号，复位，继续运行...");
                    System.out.println(Thread.interrupted());  //复位中断标记（返回值是当前是否有中断标记，这里不用管）
                }
            }
        });
        t.start();
        try {
            Thread.sleep(3000);   //休眠3秒，一定比线程t先醒来
            t.interrupt();   //调用t的interrupt方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

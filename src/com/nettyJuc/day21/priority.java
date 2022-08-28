package com.nettyJuc.day21;

public class priority {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("线程开始运行！");
        });
        t.start();
        t.setPriority(Thread.MIN_PRIORITY);  //通过使用setPriority方法来设定优先级
    }
}

package com.nettyJuc.day22.JuC;

public class loopTrue {


    //添加volatile关键字
    private static volatile int a = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (a == 0)
//                System.out.println("1111111");;
            System.out.println("线程结束！");
        }).start();

        Thread.sleep(1000);
        System.out.println("正在修改a的值...");
        a = 1;
    }


//    private static int a = 0;
//
//    public static void main(String[] args) throws InterruptedException {
//        new Thread(() -> {
//            while (a == 0) {
//                System.out.println("1111111");
//                synchronized (loopTrue.class) {
//                }
//            }
//            System.out.println("线程结束！");
//        }).start();
//
//        Thread.sleep(1000);
//        System.out.println("正在修改a的值...");
//        synchronized (loopTrue.class) {
//            System.out.println("main");
//            a = 1;
//            System.out.println("22222222");
//        }
//    }
}
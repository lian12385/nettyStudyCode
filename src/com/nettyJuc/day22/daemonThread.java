package com.nettyJuc.day22;

public class daemonThread {
//    public static void main(String[] args) throws InterruptedException{
//        Thread t = new Thread(() -> {
//            while (true){
//                try {
//                    System.out.println("程序正常运行中...");
//                    Thread t2 = new Thread(()->{
//                        System.out.println("1111111");
//                    });
//                    t2.start();
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t.setDaemon(true);   //设置为守护线程（必须在开始之前，中途是不允许转换的）
//        t.start();
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(1000);
//        }
//    }

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(() -> {
            Thread it = new Thread(() -> {
                while (true){
                    try {
                        System.out.println("程序正常运行中...");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            it.start();
        });
        t.setDaemon(true);   //设置为守护线程（必须在开始之前，中途是不允许转换的）
        t.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
    }


}


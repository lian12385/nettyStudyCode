package com.nettyJuc.day24;

import java.util.concurrent.TimeUnit;

public class timeUnit {
    public static void main(String[] args) throws InterruptedException {

            synchronized (timeUnit.class) {
                System.out.println("开始等待");
                TimeUnit.SECONDS.sleep(1);  //休眠1秒钟
                TimeUnit.SECONDS.timedWait(timeUnit.class, 3);   //直接等待3秒
                System.out.println("等待结束");
            }

        System.out.println("60秒 = "+TimeUnit.SECONDS.toMinutes(60) +"分钟");
        System.out.println("365天 = "+TimeUnit.DAYS.toSeconds(365) +" 秒");


//        Lock testLock = new ReentrantLock();
//        new Thread(() -> {
//            try {
//                testLock.lock();
//                System.out.println("等待是否未超时："+testLock.newCondition().await(3, TimeUnit.SECONDS));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            testLock.unlock();
//        }).start();
//        new Thread(() -> {
//            try {
//                System.out.println(testLock.tryLock(1,TimeUnit.NANOSECONDS));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            condition.signal();
//            testLock.unlock();
//        }).start();
//
    }
}

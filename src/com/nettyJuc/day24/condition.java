package com.nettyJuc.day24;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class condition {
    public static void main(String[] args) throws InterruptedException {
        //情况1
//        Lock testLock = new ReentrantLock();
//        Condition condition = testLock.newCondition();
//        new Thread(() -> {
//            testLock.lock();   //和synchronized一样，必须持有锁的情况下才能使用await
//            System.out.println("线程1进入等待状态！");
//            try {
//                condition.await();   //进入等待状态
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("线程1等待结束！");
//            testLock.unlock();
//        }).start();
//        Thread.sleep(100); //防止线程2先跑
//        new Thread(() -> {
//            testLock.lock();
//            System.out.println("线程2开始唤醒其他等待线程");
//            condition.signal();   //唤醒线程1，但是此时线程1还必须要拿到锁才能继续运行
//            System.out.println("线程2结束");
//            testLock.unlock();   //这里释放锁之后，线程1就可以拿到锁继续运行了
//        }).start();
//    }
        //情况2
        Lock testLock = new ReentrantLock();
        new Thread(() -> {
            testLock.lock();
            System.out.println("线程1进入等待状态！");
            try {
                testLock.newCondition().await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程1等待结束！");
            testLock.unlock();
        }).start();
        Thread.sleep(100);
        new Thread(() -> {
            testLock.lock();
            System.out.println("线程2开始唤醒其他等待线程");
            testLock.newCondition().signal();
            System.out.println("线程2结束");
            testLock.unlock();
        }).start();




    }
}

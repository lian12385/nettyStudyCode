package com.nettyJuc.day24;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {


//    public static void main(String[] args) throws InterruptedException {
//        ReentrantLock lock = new ReentrantLock();
//        Condition condition = lock.newCondition();
//        new Thread(() -> {
//            lock.lock();
//            try {
//                condition.await();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            lock.unlock();
//        }).start();
//        TimeUnit.SECONDS.sleep(1);
//        lock.lock();
//        System.out.println("当前Condition的等待线程数："+lock.getWaitQueueLength(condition));
//        condition.signal();
//        System.out.println("当前Condition的等待线程数："+lock.getWaitQueueLength(condition));
//        lock.unlock();
//    }


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        lock.lock();
//        System.out.println();
        Thread t1 = new Thread(lock::lock), t2 = new Thread(lock::lock);
        t1.start();
        t2.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("当前等待锁释放的线程数："+lock.getQueueLength());
        System.out.println("线程1是否在等待队列中："+lock.hasQueuedThread(t1));
        System.out.println("线程2是否在等待队列中："+lock.hasQueuedThread(t2));
//        lock.newCondition().await();
        System.out.println(Thread.currentThread().getName());
        System.out.println("当前线程是否在等待队列中："+lock.hasQueuedThread(Thread.currentThread()));

    }




//    public static void main(String[] args) throws InterruptedException {
//        ReentrantLock lock = new ReentrantLock();
//        lock.lock();
//        lock.lock();
//        System.out.println("当前加锁次数："+lock.getHoldCount()+"，是否被锁："+lock.isLocked());
//        TimeUnit.SECONDS.sleep(1);
//        lock.unlock();
//        System.out.println("当前加锁次数："+lock.getHoldCount()+"，是否被锁："+lock.isLocked());
//        TimeUnit.SECONDS.sleep(1);
//        lock.unlock();
//        System.out.println("当前加锁次数："+lock.getHoldCount()+"，是否被锁："+lock.isLocked());
//    }
}

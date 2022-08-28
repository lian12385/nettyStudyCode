package com.nettyJuc.day24;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lock {
        private static int i = 0;
        public static void main(String[] args) throws InterruptedException {
            Lock testLock = new ReentrantLock();   //可重入锁ReentrantLock类是Lock类的一个实现，我们后面会进行介绍
            Runnable action = () -> {
                for (int j = 0; j < 100000; j++) {   //还是以自增操作为例
                    testLock.lock();    //加锁，加锁成功后其他线程如果也要获取锁，会阻塞，等待当前线程释放
                    i++;
                    testLock.unlock();  //解锁，释放锁之后其他线程就可以获取这把锁了（注意在这之前一定得加锁，不然报错）
                }
            };
            new Thread(action).start();
            new Thread(action).start();
            Thread.sleep(1000);   //等上面两个线程跑完
            System.out.println(i);
        }
}

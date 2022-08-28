package com.nettyJuc.day22;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class sunTimeTick {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                timer.cancel();  //结束
            }
        }, 1000);
    }
}

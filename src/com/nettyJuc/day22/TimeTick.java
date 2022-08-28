package com.nettyJuc.day22;

public class TimeTick {
    public static void main(String[] args) {
        new TimerLoopTask(() -> System.out.println("我是定时任务！"), 3000).start();   //创建并启动此定时任务
    }

    static class TimerLoopTask{
        Runnable task;
        long loopTime;

        public TimerLoopTask(Runnable runnable, long loopTime){
            this.task = runnable;
            this.loopTime = loopTime;
        }

        public void start(){
            new Thread(() -> {
                try {
                    while (true){   //无限循环执行
                        Thread.sleep(loopTime);
                        task.run();   //休眠后再运行
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

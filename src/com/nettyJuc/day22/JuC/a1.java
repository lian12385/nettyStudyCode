package com.nettyJuc.day22.JuC;

public class a1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 2, 4};

        for (int i : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(i * 1000);   //越小的数休眠时间越短，优先被打印
                    System.out.println(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

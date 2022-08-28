package com.nettyJuc.day22.JuC;

public class reSort {
    private static int a = 0;
    private static int b = 0;

    public static void main(String[] args) {


;

        new Thread(() -> {
            if (b == 1) {
                if (a == 0) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
        }).start();


        new Thread(() -> {
            a = 1;
            b = 1;
        }).start();

    }
}

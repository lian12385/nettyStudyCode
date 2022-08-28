package com.nettyJuc.day22.JuC;

public class happenBefore {
    private static int a = 0;
    private static int b = 0;

    public static void main(String[] args) {
        a = 10;
        b = a + 1;
        new Thread(() -> {
            if (b > 10) System.out.println(a);
        }).start();
    }
}

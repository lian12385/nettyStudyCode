package com.nettyJuc.day22.JuC;

import sun.applet.Main;

public class byteCode {
    public static void main(String[] args) {

    }
    void test(){
        synchronized (Main.class) {
            //这里使用的是Main类的Class对象作为锁
        }
    }
}

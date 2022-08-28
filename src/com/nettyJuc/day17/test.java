package com.nettyJuc.day17;

public class test {
    private static final test INSTANCE = new test();
    private test(){};
    public static test getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("111111");
        throw new RuntimeException("测试!");
    }
}

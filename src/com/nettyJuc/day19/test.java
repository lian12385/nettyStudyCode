package com.nettyJuc.day19;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class test {
    public static void main(String[] args) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] ids = bean.getAllThreadIds();
        ThreadInfo[] infos = bean.getThreadInfo(ids);
        for (ThreadInfo info : infos) {
            System.out.println(info.getThreadName());
        }
    }
}

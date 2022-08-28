package com.nettyJuc.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parallel {
//    public static void main(String[] args) {
////        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 9, 3, 6, 0));
////        list
////                .parallelStream()    //获得并行流
////                .forEach(i -> System.out.println(Thread.currentThread().getName()+" -> "+i));
//            List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 9, 3, 6, 0));
//            list
//                    .parallelStream()    //获得并行流
//                    .forEachOrdered(System.out::println);
//
//    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 2, 9, 3, 6, 0};
        Arrays.parallelSetAll(arr, i -> {
            System.out.println(Thread.currentThread().getName());
            return arr[i];
        });
        System.out.println(Arrays.toString(arr));
    }
}

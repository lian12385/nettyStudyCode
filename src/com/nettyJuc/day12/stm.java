package com.nettyJuc.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stm {
        public static void main(String[] args) {
            List<Map<String, Double>> list = new ArrayList<>();
            Map<String, Double> map = new HashMap();
            map.put("int1", list.stream().mapToDouble(m -> m.get("int1")).sum());
            map.put("int2", list.stream().mapToDouble(m -> m.get("int2")).sum());
            map.put("int3", list.stream().mapToDouble(m -> m.get("int3")).sum());

            for (int i = 1; i <= 5; i++) {
                String key = "int" + i;
                String value = "int" + i;
                map.put(key, list.stream().mapToDouble(m -> m.get(value)).sum());
            }

            map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
    static void cc(){
        List<Map<String,Double>> list = new ArrayList<>();
        Map<String,Double> map = new HashMap();
        map.put("a1",list.stream().mapToDouble(m->m.get("int1")).sum());
        map.put("b1",list.stream().mapToDouble(m->m.get("int2")).sum());
        map.put("c1",list.stream().mapToDouble(m->m.get("int3")).sum());
    }

    static void cc1(){
        List<Map<String,Integer>> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            Map<String,Integer> map = new HashMap();
            for (int j=0;j<5;j++){
                map.put("int"+j,3*i+j);
            }
            list.add(map);
        }
        for (Map<String, Integer> stringIntegerMap : list) {
            for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
                     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                 }
        }
        Map<String,Integer> map = new HashMap();
        map.put("int1",list.stream().mapToInt(m->m.get("int1")).sum());
        map.put("int2",list.stream().mapToInt(m->m.get("int2")).sum());
        map.put("int3",list.stream().mapToInt(m->m.get("int3")).sum());
        System.out.println(map.get("int1"));
        System.out.println(map.get("int2"));
        System.out.println(map.get("int3"));
        //...
    }
}

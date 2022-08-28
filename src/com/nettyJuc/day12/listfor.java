package com.nettyJuc.day12;

import javax.swing.text.html.Option;
import java.util.*;

public class listfor {
    public static void main(String[] args) {
            new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1231);
            }
        });
    }
    void ccc(){
        List<Map<String, Integer>> list = new ArrayList<>();
        Optional<Map<String,Integer>> optional = list.stream().reduce((map1,map2)->{
            Map<String,Integer> mapEnd = new HashMap<>();
            map1.forEach((key,value)->
                    mapEnd.put(key, value+map2.get(key)));
            return mapEnd;
        });
    }
}

package com.bercut.collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {

        Map<String, Integer> freqMap = new HashMap<>();

        for (String arg : args) {
            if (freqMap.containsKey(arg)) {
                Integer count = freqMap.get(arg);
                count++;
                freqMap.put(arg, count);
            } else {
                freqMap.put(arg, 1);
            }
        }

        System.out.println("Map:");
        freqMap
                .entrySet()
                .forEach(
                        e-> System.out.printf("key=%s val=%s\n", e.getKey(), e.getValue()));
    }
}

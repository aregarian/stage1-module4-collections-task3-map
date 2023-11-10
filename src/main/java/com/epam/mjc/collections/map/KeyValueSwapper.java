package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {


        Map<String,Integer> swappedMap = new HashMap<>();





        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();


            if (!swappedMap.containsKey(value) || key < swappedMap.get(value)) {
                swappedMap.put(value, key);
            }
        }






        return swappedMap;
    }
}

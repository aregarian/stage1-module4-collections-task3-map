package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String,Integer> hehe = new HashMap<>();

        for (Map.Entry<Integer,String> me :
                sourceMap.entrySet()) {

            if (sourceMap.containsValue(me.getValue())) {
                sourceMap.
            }

        }







        for (Map.Entry<Integer,String> me :
                sourceMap.entrySet()) {


            hehe.put(me.getValue(),me.getKey());

        }






        return hehe;
    }
}

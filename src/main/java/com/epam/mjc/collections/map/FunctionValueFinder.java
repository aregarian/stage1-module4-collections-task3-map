package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {

        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        boolean check = false;

         for (Map.Entry<Integer,Integer> hehe :
                    functionMap.entrySet()) {

             if (hehe.getValue() == requiredValue) {
                 check = true;

             }
         }

        return check;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {

        Map<Integer,Integer> hehe = new HashMap<>();

        for (int i = 0; i < sourceList.size(); i++) {
            hehe.put( sourceList.get(i), 5 * sourceList.get(i) +2);
        }

        return hehe;
    }
}

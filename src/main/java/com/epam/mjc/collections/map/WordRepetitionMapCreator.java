package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> hehe = new HashMap<>();
        sentence = sentence.toLowerCase();
        StringTokenizer str = new StringTokenizer(sentence, " .,");
        Map<String, Integer> hehe1 = new HashMap<>();

        int i = 0;
        while (str.hasMoreTokens()) {
            String sss = str.nextToken();
            if (hehe.containsKey(sss)) {
                hehe.put(sss, 2);
            }else {
                hehe.put(sss, 1 + i);
            }



        }
        return hehe;

    }
}

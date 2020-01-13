package com.algo.bootcamp.questions;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {

    public String getMax(String text){
        int max = 0;
        String maxChar = "";
        HashMap<String, Integer> map = map(text);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }

    private HashMap<String, Integer> map(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = text.toCharArray();
        for (char value: chars){
            String letter = String.valueOf(value);

            if (map.containsKey(letter)){
                Integer count = map.get(letter);
                map.put(letter, count + 1);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }
}

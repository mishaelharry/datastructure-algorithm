package com.algo.bootcamp.questions;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public boolean isAnagram1(String text1, String text2){
        HashMap<String, Integer> map1 = map(text1);
        HashMap<String, Integer> map2 = map(text2);
        return map1.equals(map2);
    }

    private HashMap<String, Integer> map(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        text =  text.replace("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = text.toCharArray();

        for (char val : arr){
            String letter = String.valueOf(val);
            if (map.containsKey(letter)){
                int count = map.get(letter);
                map.put(letter, count + 1);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }

    public boolean isAnagram2(String text1, String text2){
        text1 = text1.replace("!", "").toLowerCase();
        text2 = text2.replace("!", "").toLowerCase();

        char[] arr1 = text1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = text2.toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

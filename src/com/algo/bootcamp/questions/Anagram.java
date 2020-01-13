package com.algo.bootcamp.questions;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public boolean isAnagram1(String text1, String text2){
        HashMap<String, Integer> map1 = map(text1.replace("!", "").toLowerCase());
        HashMap<String, Integer> map2 = map(text2.replace("!", "").toLowerCase());
        return map1.equals(map2);
    }

    private HashMap<String, Integer> map(String text1) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] arr = text1.toCharArray();

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

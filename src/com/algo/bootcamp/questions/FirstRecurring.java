package com.algo.bootcamp.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstRecurring {


    public int getReoccurring(int[] values){
        int recurring = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : values){
            if (map.containsKey(item)){
                int count = map.get(item);
                map.put(item, count + 1);
                recurring = item;
            } else {
                map.put(item, 1);
            }
        }
        return recurring;
    }
}

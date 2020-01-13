package com.algo.bootcamp.questions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> printFizzBuzz(int n){
        List<String> content = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                content.add("FizzBuzz");
            } else if (i % 3 == 0){
                content.add("Fizz");
            } else if (i % 5 == 0){
                content.add("Buzz");
            } else {
                content.add(String.valueOf(i));
            }
        }
        return content;
    }
}

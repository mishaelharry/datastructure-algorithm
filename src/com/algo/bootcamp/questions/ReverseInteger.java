package com.algo.bootcamp.questions;

public class ReverseInteger {

    public int reserve(int value){
        boolean isNegative = value < 0;
        String converted = String.valueOf(value);
        String reversed = "";
        char[] content = converted.toCharArray();
        int length = content.length;
        for (int i = 0; i < length; i++){
            reversed += content[length - i - 1];
        }
        if (isNegative) {
            return Integer.parseInt(reversed.replace("-", "")) * -1;
        }
        return Integer.parseInt(reversed);
    }
}

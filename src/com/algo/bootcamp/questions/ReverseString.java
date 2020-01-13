package com.algo.bootcamp.questions;

public class ReverseString {

    public String reverse1(String text){
        String reversed = "";
        char[] charText = text.toCharArray();
        for (int i = 0; i < charText.length; i++){
            reversed += charText[charText.length - i - 1];
        }
        return reversed;
    }

    public String reverse2(String text){
        StringBuilder result = new StringBuilder(text);
        return result.reverse().toString();
    }

    public String reverse3(String text){
        String reversed = "";
        for (char character : text.toCharArray()) {
            reversed = character + reversed;
        }
        return reversed;
    }
}

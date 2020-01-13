package com.algo.bootcamp.questions;

public class Palindrome {

    public boolean isPalindrome1(String text){
        char[] content = text.toCharArray();
        int length = content.length;
        for (int i = 0; i < length / 2; i++){
            if (content[i] != content[length - i - 1]){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String text){
        String reversed = "";
        char[] content = text.toCharArray();
        int length = content.length;
        for (int i = 0; i < length; i++){
            reversed += content[length - i - 1];
        }
        return reversed.equals(text);
    }

    public boolean isPalindrome3(String text){
        String reversed = "";
        char[] content = text.toCharArray();
        for (char val : content){
            reversed = val + reversed;
        }
        return reversed.equals(text);
    }

    public boolean isPalindrome4(String text){
        StringBuilder content = new StringBuilder(text);
        content.reverse();
        String reversed = content.toString();
        return reversed.equals(text);
    }
}

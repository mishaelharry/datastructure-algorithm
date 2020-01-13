package com.algo.bootcamp.questions;

public class FibonacciNaive {

    public int fib1(int n){
        if (n < 2){
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public int fib2(int n){
        if (n <= 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fib2(n - 1) + fib2(n - 2);
        }
    }

}

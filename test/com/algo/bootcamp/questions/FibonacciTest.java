package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private FibonacciNaive naive;
    private FibonacciMemoized memo;

    @Before
    public void setUp() throws Exception {
        naive = new FibonacciNaive();
        memo = new FibonacciMemoized();
    }

    @Test
    public void Naive(){
        //Fib 1
        Assert.assertEquals(0, naive.fib1(0));
        Assert.assertEquals(1, naive.fib1(1));
        Assert.assertEquals(1, naive.fib1(2));
        Assert.assertEquals(2, naive.fib1(3));
        Assert.assertEquals(3, naive.fib1(4));
        Assert.assertEquals(5, naive.fib1(5));
        Assert.assertEquals(8, naive.fib1(6));
        Assert.assertEquals(13, naive.fib1(7));
        Assert.assertEquals(21, naive.fib1(8));

        //Fib 2
        Assert.assertEquals(0, naive.fib2(0));
        Assert.assertEquals(1, naive.fib2(1));
        Assert.assertEquals(1, naive.fib2(2));
        Assert.assertEquals(2, naive.fib2(3));
        Assert.assertEquals(3, naive.fib2(4));
        Assert.assertEquals(5, naive.fib2(5));
        Assert.assertEquals(8, naive.fib2(6));
        Assert.assertEquals(13, naive.fib2(7));
        Assert.assertEquals(21, naive.fib2(8));
    }

    @Test
    public void Memoized(){
        Assert.assertEquals(0, memo.fib(0));
        Assert.assertEquals(1, memo.fib(1));
        Assert.assertEquals(1, memo.fib(2));
        Assert.assertEquals(2, memo.fib(3));
        Assert.assertEquals(3, memo.fib(4));
        Assert.assertEquals(5, memo.fib(5));
        Assert.assertEquals(8, memo.fib(6));
        Assert.assertEquals(13, memo.fib(7));
        Assert.assertEquals(21, memo.fib(8));
    }

}
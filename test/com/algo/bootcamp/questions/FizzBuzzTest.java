package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void printFizzBuzz() {
        List<String> expected = new ArrayList<>(Arrays.asList(new String[]{"1", "2", "Fizz", "4", "Buzz"}));
        Assert.assertEquals(expected, fizzBuzz.printFizzBuzz(5));
    }
}
package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void setUp() throws Exception {
        reverseString = new ReverseString();
    }

    @Test
    public void reverse() {
        Assert.assertEquals("olleh", reverseString.reverse1("hello"));
        Assert.assertEquals("yrrah", reverseString.reverse2("harry"));
        Assert.assertEquals("yrrah", reverseString.reverse3("harry"));

    }
}
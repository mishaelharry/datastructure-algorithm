package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCharTest {

    private MaxChar maxChar;

    @Before
    public void setUp() throws Exception {
        maxChar = new MaxChar();
    }

    @Test
    public void maxChar(){
        Assert.assertEquals("l", maxChar.getMax("Hello"));
    }
}
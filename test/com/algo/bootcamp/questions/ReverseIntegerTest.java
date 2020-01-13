package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void setUp() throws Exception {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void reserve() {
        Assert.assertEquals(51, reverseInteger.reserve(15));
        Assert.assertEquals(189, reverseInteger.reserve(981));
        Assert.assertEquals(5, reverseInteger.reserve(500));
        Assert.assertEquals(-15, reverseInteger.reserve(-51));
        Assert.assertEquals(-9, reverseInteger.reserve(-90));

    }
}
package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FirstRecurringTest {

    private FirstRecurring firstRecurring;

    @Before
    public void setUp(){
        firstRecurring = new FirstRecurring();
    }

    @Test
    public void getReoccurring() {
        int[] actual = {2,5,1,2,3,5,1,2,4};
        Assert.assertEquals(2, firstRecurring.getReoccurring(actual));
    }
}
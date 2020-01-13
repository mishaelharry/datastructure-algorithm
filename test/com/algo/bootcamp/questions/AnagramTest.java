package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    private Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void isAnagram1() {
        Assert.assertTrue(anagram.isAnagram1("rail safety", "fairy tales"));
        Assert.assertTrue(anagram.isAnagram2("RAIL! SAFETY!", "fairy tales"));
        Assert.assertFalse(anagram.isAnagram1("Hi there", "Bye there"));
    }
}
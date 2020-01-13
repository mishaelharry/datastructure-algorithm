package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome1() {
        Assert.assertTrue(palindrome.isPalindrome1("mom"));
        Assert.assertFalse(palindrome.isPalindrome1("harry"));
    }

    @Test
    public void isPalindrome2() {
        Assert.assertTrue(palindrome.isPalindrome1("dad"));
    }

    @Test
    public void isPalindrome3() {
        Assert.assertTrue(palindrome.isPalindrome1("abba"));
    }

    @Test
    public void isPalindrome4() {
        Assert.assertTrue(palindrome.isPalindrome1("sos"));
    }
}
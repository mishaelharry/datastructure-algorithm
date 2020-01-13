package com.algo.bootcamp.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayChunkTest {

    private ArrayChunk chunk;

    @Before
    public void setUp() throws Exception {
        chunk = new ArrayChunk();
    }

    @Test
    public void chunk() {
        Assert.assertEquals(new int[][] {new int []{1, 2}}, chunk.chunk(new int[] {1, 2}, 2));
    }
}
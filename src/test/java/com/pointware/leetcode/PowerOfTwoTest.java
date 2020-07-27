package com.pointware.leetcode;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTwoTest {
    @Test
    public void basicTest(){
        assertTrue(PowerOfTwo.isPowerOfTwo(1));
        assertTrue(PowerOfTwo.isPowerOfTwo(16));
        assertFalse(PowerOfTwo.isPowerOfTwo(218));
        assertFalse(PowerOfTwo.isPowerOfTwo(5));

    }
    @Test
    public void overflowTest(){
        assertFalse(PowerOfTwo.isPowerOfTwo(1073741825));
    }

    @Test
    public void test(){
        assertTrue(PowerOfTwo.isPowerOfTwo(-4));
    }
}

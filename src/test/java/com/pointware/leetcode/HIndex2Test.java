package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HIndex2Test implements TestCase {

    @Test
    @Override
    public void basicTest(){
        assertEquals(HIndex2.hIndex(new int[]{0,1,3,5,6}), 3);
        assertEquals(HIndex2.hIndex(new int[]{0,0,1}), 1);
        assertEquals(HIndex2.hIndex(new int[]{1,1,1}), 1);
        assertEquals(HIndex2.hIndex(new int[]{1,1,2}), 1);
        assertEquals(HIndex2.hIndex(new int[]{1,2,2}), 2);
        assertEquals(HIndex2.hIndex(new int[]{0,0,0}), 0);
        assertEquals(HIndex2.hIndex(new int[]{1,2,2,3,3}), 2);
        assertEquals(HIndex2.hIndex(new int[]{1,3,3}), 2);
        assertEquals(HIndex2.hIndex(new int[]{2,3,3}), 2);
        assertEquals(HIndex2.hIndex(new int[]{2,2,6,6}), 2);
    }

    @Test
    public void failedCase(){
        assertEquals(HIndex2.hIndex(new int[]{100}), 1);
        assertEquals(HIndex2.hIndex(new int[]{0,2}), 1);
        assertEquals(HIndex2.hIndex(new int[]{3,3}), 2);
        assertEquals(HIndex2.hIndex(new int[]{0,0,0,3,3}), 2);
    }
}

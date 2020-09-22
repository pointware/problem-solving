package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoCitySchedulingTest {

    @Test
    public void basicTest(){
        assertEquals(110, TwoCityScheduling.twoCitySchedCost(new int[][]{
                {10, 20},
                {30, 200},
                {400, 50},
                {30, 20}
        }));
    }
}

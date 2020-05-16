package com.pointware.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumSubArrayTest {

    @Test
    public void testCase() {
        int[] testCase = new int[]{
                -2, 1, -3, 4, -1, 2, 1, -5, 4
        };

        assertEquals(MaximumSubarray.maxSubArray(testCase), 6);
    }

    @Test
    public void testSize(){
        int[] testCase = new int[] {-3, 1};
        assertEquals(MaximumSubarray.maxSubArray(testCase), 1);
    }
}

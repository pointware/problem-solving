package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest implements TestCase {

    @Test
    @Override
    public void basicTest() {
        int result = new MinimumPathSum().minPathSum(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        });

        assertEquals(7, result);
    }

    @Test
    public void failedTimeLimitExceeded(){
        int result = new MinimumPathSum().dp(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        });

        assertEquals(7, result);
    }
}

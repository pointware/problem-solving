package com.pointware.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ClimbingLeaderboardTest {

    @Test
    public void test(){
        int[] scores = new int[]{
                100,100,50,40,40,20,10
        };
        int[] alice = new int[] {
                5,25,50,120
        };
        int[] result = ClimbingLeaderboard.run(scores, alice);
        assertArrayEquals(result, new int[]{6,4,2,1});
    }
}

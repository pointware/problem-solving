package com.pointware.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {
    @Test
    public void basicTest(){
        int[] testCase = new int[]{0,1,0,3,12};
        int[] expect = new int[]{1,3,12,0,0};
        assertArrayEquals(MoveZeroes.moveZeroes(testCase), expect);
    }

    @Test
    public void customTest(){
        int[] testCase = new int[]{1, 0, 1, 2, 0, 0, 4, 5};
        int[] expect = new int[]{1, 1, 2, 4, 5, 0,0,0};
        assertArrayEquals(MoveZeroes.moveZeroes(testCase), expect);
    }

    @Test
    public void wrongAnswerTest(){
        int[] testCase = new int[]{4,2,4,0,0,3,0,5,1,0};
        int[] expect = new int[]{4,2,4,3,5,1,0,0,0,0};
        assertArrayEquals(MoveZeroes.moveZeroes(testCase), expect);
    }
}

package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QueueReconstructionByHeightTest implements TestCase {

    @Test
    @Override
    public void basicTest() {
        int[][] result = new QueueReconstructionByHeight().reconstructQueue(new int[][]{
                {7,0},
                {4,4},
                {7,1},
                {5,0},
                {6,1},
                {5,2}
        });
        assertArrayEquals(new int[][]{
                {5,0},
                {7,0},
                {5,2},
                {6,1},
                {4,4},
                {7,1}
        }, result);
    }

    @Test
    public void edgeCaseTest(){
        assertArrayEquals(new int[][]{}, new QueueReconstructionByHeight().reconstructQueue(new int[][]{}));
    }
}

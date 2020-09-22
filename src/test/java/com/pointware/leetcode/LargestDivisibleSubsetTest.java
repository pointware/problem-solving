package com.pointware.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class LargestDivisibleSubsetTest {

    private int[] getResult(int[] target){
        List<Integer> result = LargestDivisibleSubset.largestDivisibleSubset(target);
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void basicTest(){
        assertArrayEquals(getResult(new int[]{1,2,3}), new int[]{1,2});
    }
}

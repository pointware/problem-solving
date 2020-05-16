package com.pointware.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaximumSubarray {
    /**
     * kadane's algorithm...
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int[] subSum = new int[nums.length];

        subSum[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            subSum[i] = Math.max(subSum[i-1] + nums[i], nums[i]);
        }
        return Arrays.stream(subSum).max().getAsInt();
    }
}

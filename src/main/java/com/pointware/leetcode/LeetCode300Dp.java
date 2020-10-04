package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode300;

public class LeetCode300Dp implements LeetCode300 {
    @Override
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int[] memo = new int[nums.length];
        // 초기값
        memo[0] = 1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            int maxVal = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxVal = Math.max(memo[j], maxVal);
                }
            }
            memo[i] = maxVal + 1;
            max = Math.max(max, memo[i]);
        }
        return max;
    }
}

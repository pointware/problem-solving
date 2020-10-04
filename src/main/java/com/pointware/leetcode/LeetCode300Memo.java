package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode300;

public class LeetCode300Memo implements LeetCode300 {
    @Override
    public int lengthOfLIS(int[] nums) {
        int[][] memo = new int[nums.length + 1][nums.length];
        return lengthOfLIS(nums, -1, 0, memo);
    }

    public int lengthOfLIS(int[] nums, int prevPos, int currPos, int[][] memo) {
        if (currPos == nums.length) {
            return 0;
        }
        int taken = 0;
        //ex) 2+1 3
        if (memo[prevPos + 1][currPos] > 0) {
            return memo[prevPos + 1][currPos];
        }
        if (prevPos < 0 || nums[currPos] > nums[prevPos]) {
            // 현재의 값이 이전의 값보다 크면 다음의 LIS test로 넘긴다.
            taken = 1 + lengthOfLIS(nums, currPos, currPos + 1, memo);
        }
        //현재의 값을 기반으로 계산하지 않고 다음의 값으로 계산을 한다.
        int notTaken = lengthOfLIS(nums, prevPos, currPos + 1, memo);

        return memo[prevPos + 1][currPos] = Math.max(taken, notTaken);
    }
}

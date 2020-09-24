package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode238;

public class LeetCode238Impl implements LeetCode238 {
    @Override
    public int[] productExceptSelf(int[] nums) {
        //without division, o(n)
        int tmp = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        tmp = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }
}

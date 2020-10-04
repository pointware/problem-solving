package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode334;

import java.util.Arrays;

public class LeetCode334Impl implements LeetCode334 {
    @Override
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int len = 0;
        int[] memo = new int[3];
        for (var num : nums) {
            int index = Arrays.binarySearch(memo, 0, len, num);
            if (index < 0) {
                index = -(index + 1);
            }
            memo[index] = num;
            if (index == len) {
                len++;
            }
            if (len == 3) {
                return true;
            }
        }
        return len > 2;
    }
}

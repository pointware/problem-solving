package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode75;

public class LeetCode75Impl implements LeetCode75 {
    @Override
    public int[] sortColors(int[] nums) {
        if (nums.length == 0) return nums;

        int two = nums.length;
        int zero = -1;

        for (int i = 0; i < nums.length && i < two; i++) {
            if (nums[i] == 0) {
                swap(nums, ++zero, i);
            } else if (nums[i] == 2) {
                swap(nums, --two, i);
            }
        }

        return nums.clone();
    }

    private void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}

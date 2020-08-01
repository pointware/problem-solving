package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode34;


public class LeetCode34Solution implements LeetCode34 {
    public int binarySearch(int[] nums, int target, int type) {
        int result = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                if (type == 0) {
                    result = result != -1 ? Math.min(result, mid) : mid;
                    right = mid - 1;
                } else {
                    result = result != -1 ? Math.max(result, mid) : mid;
                    left = mid + 1;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    @Override
    public int[] searchRange(int[] nums, int target) {
        //in binary search,
        // lower part
        // high part
        return new int[]{
                binarySearch(nums, target, 0),
                binarySearch(nums, target, 1)
        };

    }
}

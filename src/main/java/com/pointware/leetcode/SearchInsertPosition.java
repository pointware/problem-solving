package com.pointware.leetcode;

import java.util.Arrays;

public class SearchInsertPosition {

    public static class Basic implements com.pointware.leetcode.problem.SearchInsertPosition{
        @Override
        public int searchInsert(int[] nums, int target) {
            if (nums.length == 0) return 0;
            for (int i = 0; i < nums.length; i++) {
                // if array value is bigger than target, it should return current index.
                // even if array value is the same
                if (nums[i] >= target) {
                    return i;
                }
            }
            return nums.length;
        }
    }

    public static class BSearch implements com.pointware.leetcode.problem.SearchInsertPosition {
        @Override
        public int searchInsert(int[] nums, int target) {
            var index = Arrays.binarySearch(nums, target);
            if(index >= 0) return index;
            else{
                return Math.abs(index) - 1;
            }
        }
    }
}

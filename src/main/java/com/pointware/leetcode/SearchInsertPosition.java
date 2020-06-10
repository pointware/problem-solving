package com.pointware.leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        for(int i =0; i < nums.length; i++) {
            // if array value is bigger than target, it should return current index.
            // even if array value is the same
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode41;

public class LeetCode41Impl implements LeetCode41 {
    @Override
    public int firstMissingPositive(int[] nums) {
        // unsorted integer array, find smallest missing positive integer
        for(int i=0; i< nums.length;){
            if(nums[i] > nums.length || nums[i] <= 0 || nums[i] == i+1){
                i++;
            } else if(nums[nums[i]-1] != nums[i]){
                    swap(nums, nums[i] - 1, i);
            } else {
                nums[i] = -1;
            }
        }
        int result = 0;
        while(result < nums.length){
            if(nums[result] == result+1){
                result++;
            }else{
                break;
            }
        }
        return result+1;
    }
    private void swap(int[] nums, int t1, int t2){
        var temp = nums[t1];
        nums[t1] = nums[t2];
        nums[t2] = temp;
    }
}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode11;

public class LeetCode11Impl implements LeetCode11 {
    @Override
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            maxWater = Math.max(maxWater, minHeight * width);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}

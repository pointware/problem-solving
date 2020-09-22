package com.pointware.leetcode;

import java.util.*;


public class LargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {

        Arrays.sort(nums);
        //if source number can divide target number, count up.
        int[] dp = new int[nums.length];

        int[] indices = new int[nums.length];
        //
        Arrays.fill(dp, 1);
        Arrays.fill(indices, -1);

        int maxCount = 0;
        int maxCountIndex = -1;

        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums.length; j++){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                    indices[j] = i;
                }
            }
//            if(maxCount < )
        }

        return null;
    }
}

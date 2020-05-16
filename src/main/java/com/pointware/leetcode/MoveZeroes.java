package com.pointware.leetcode;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        // without making a copy of the array.
        // minimize the total number of operation.
        int zeroIndex = 0;
        int numberIndex = -1;
        for(; zeroIndex < nums.length; zeroIndex++){
            if(nums[zeroIndex] != 0) {
                continue;
            }
            if(numberIndex == -1){
                numberIndex = zeroIndex+1;
            }else{
                numberIndex++;
            }
            for (; numberIndex < nums.length; numberIndex++){
                if(nums[numberIndex] != 0){
                    nums[zeroIndex] = nums[numberIndex];
                    nums[numberIndex] = 0;
                    break;
                }
            }
        }
        return nums;
    }
}

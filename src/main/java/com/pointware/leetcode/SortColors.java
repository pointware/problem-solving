package com.pointware.leetcode;

public class SortColors {
    public static void sortColors(int[] nums) {
        if(nums.length < 2) return;
        int i=0;
        int red = 0;
        int blue = nums.length-1;

        //boundary check...
        while(i <= blue){
            if(nums[i] == 0){
                nums[i] = nums[red];
                nums[red] = 0;
                red++;
                i++;
            }else if(nums[i] == 2){
                nums[i] = nums[blue];
                nums[blue] = 2;
                blue--;
            }else{
                i++;
            }
        }
    }
}

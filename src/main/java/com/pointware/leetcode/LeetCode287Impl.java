package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode287;

public class LeetCode287Impl implements LeetCode287 {
    @Override
    public int findDuplicate(int[] nums) {
        //cycle detection
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        //cycle range
        fast = 0;
        do {
            slow = nums[slow];
            fast = nums[fast];
        }while(slow != fast);

        return slow;
    }
}

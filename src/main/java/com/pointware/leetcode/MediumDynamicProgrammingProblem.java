package com.pointware.leetcode;

public class MediumDynamicProgrammingProblem {
    public boolean canJump(int[] nums) {
        boolean[] canVisits = new boolean[nums.length];
        canVisits[0] = true;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            count--;
            if (count >= 0) {
                canVisits[i] = true;
            }
            if (canVisits[i] && nums[i] > 0) {
                count = Math.max(nums[i], count);
            }
        }

        return canVisits[nums.length - 1];
    }
}

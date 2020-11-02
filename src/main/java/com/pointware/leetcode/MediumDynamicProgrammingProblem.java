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

    public int uniquePaths(int m, int n) {
        int[][] paths = new int[n][m];
        for (var i = 0; i < m; i++) {
            paths[0][i] = 1;
        }
        for (var i = 0; i < n; i++) {
            paths[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }

        return paths[n - 1][m - 1];
    }
}

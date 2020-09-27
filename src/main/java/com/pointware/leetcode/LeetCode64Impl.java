package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode64;

public class LeetCode64Impl implements LeetCode64 {
    @Override
    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length][grid[0].length];

        memo[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            memo[0][i] = memo[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            memo[i][0] = memo[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                memo[i][j] = grid[i][j] + Math.min(
                        memo[i - 1][j], memo[i][j - 1]
                );
            }
        }

        return memo[grid.length - 1][grid[0].length - 1];
    }
}

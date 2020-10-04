package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode96;

public class LeetCode96Impl implements LeetCode96 {
    @Override
    public int numTrees(int n) {
        if (n < 2) return 1;
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                memo[i] +=
                        memo[i - j] *   //
                                memo[j - 1];    // 이전 스탭 node의 값
            }
        }
        return memo[n];
    }
}

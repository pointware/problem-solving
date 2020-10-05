package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode279;

import java.util.Arrays;

public class LeetCode279ImplDp implements LeetCode279 {
    public int numSquares(int n) {
        int[] memorize = new int[n + 1];
        Arrays.fill(memorize, Integer.MAX_VALUE);
        memorize[0] = 0;
        return revision(n, memorize);
    }

    private int revision(int currNum, int[] memorize) {
        for (int i = 1; i <= currNum; i++) {
            for (int j = 1; j * j <= i; j++) {
                memorize[i] = Math.min(memorize[i], memorize[i - j * j] + 1);
            }
        }
        return memorize[currNum];
    }
}

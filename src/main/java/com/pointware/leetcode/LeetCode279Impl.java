package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode279;

import java.util.Arrays;
import java.util.Map;

public class LeetCode279Impl implements LeetCode279 {
    @Override
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

    private int recursion(int currNum, Map<Integer, Integer> memorize) {
        int min = Integer.MAX_VALUE;
        if (currNum == 0) {
            return 1;
        }
        if (currNum < 0) {
            return 0;
        }
        int maxNumb = (int) Math.round(Math.sqrt(currNum));
        for (int i = maxNumb; i >= 1; i--) {
            int ntNum = currNum - (int) Math.pow(i, 2);
            if (memorize.containsKey(ntNum)) {
                min = Math.min(min, memorize.get(ntNum) + 1);
            } else {
                if (ntNum == 0) {
                    min = Math.min(min, 1);
                } else if (ntNum > 0) {
                    min = Math.min(min, recursion(ntNum, memorize) + 1);
                }
            }
        }
        memorize.put(currNum, min);
        return min;
    }
}

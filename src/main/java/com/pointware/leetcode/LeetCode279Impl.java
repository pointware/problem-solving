package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode279;

import java.util.HashMap;
import java.util.Map;

public class LeetCode279Impl implements LeetCode279 {
    @Override
    public int numSquares(int n) {
        Map<Integer, Integer> memorize = new HashMap<>();
        memorize.put(1, 1);
        return recursion(n, memorize);
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

package com.pointware.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class DavisStaircaseImpl implements DavisStaircase {
    @Override
    public int stepPerms(int n) {
        final long modNum = 10_000_000_007L;
        Map<Integer, Long> stepMap = new HashMap<>();
        stepMap.put(1, 1L);
        stepMap.put(2, 2L);
        stepMap.put(3, 4L);
        helper(n, stepMap);
        long result = stepMap.get(n) % modNum;
        return (int) result;
    }

    private long helper(int n, Map<Integer, Long> stepMap) {
        if (n < 1) return 0L;
        if (stepMap.containsKey(n)) {
            return stepMap.get(n);
        }

        long num = helper(n - 1, stepMap) +
                helper(n - 2, stepMap) +
                helper(n - 3, stepMap);
        stepMap.put(n, num);
        return num;
    }
}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode454;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LeetCode454Impl2 implements LeetCode454 {
    @Override
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> firstMap = comb(A, B);
        Map<Integer, Integer> secondMap = comb(C, D);

        return firstMap.entrySet().stream().map(o -> {
            int inverse = secondMap.getOrDefault(-o.getKey(), 0);
            return inverse * o.getValue();
        }).flatMapToInt(IntStream::of).sum();
    }

    private Map<Integer, Integer> comb(int[] group1, int[] group2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group2.length; j++) {
                int key = group1[i] + group2[j];
                int count = map.getOrDefault(key, 0);
                map.put(key, count + 1);
            }
        }
        return map;
    }
}

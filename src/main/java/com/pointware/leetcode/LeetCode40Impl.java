package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40Impl implements LeetCode40 {
    @Override
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        var list = new ArrayList<List<Integer>>();

        helper(candidates, 0, target, new ArrayList<>(), list);

        return list;
    }

    public void helper(int[] candidates, int idx, int target, List<Integer> temp, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (idx >= candidates.length) return;
        int prev = -1;
        for (int i = idx; i < candidates.length && candidates[i] <= target; i++) {
            if (prev != candidates[i]) {
                temp.add(candidates[i]);
                helper(candidates, i + 1, target - candidates[i], temp, result);
                temp.remove(temp.size() - 1);
            }
            prev = candidates[i];
        }
    }
}

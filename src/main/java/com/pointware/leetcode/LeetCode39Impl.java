package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode39;

import java.util.ArrayList;
import java.util.List;

public class LeetCode39Impl implements LeetCode39 {
    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        var list = new ArrayList<List<Integer>>();
        recursion(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void recursion(List<List<Integer>> result, List<Integer> subList,
                           int[] candi,
                           int target, int start) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(subList));
        }
        for (int i = start; i < candi.length; i++) {
            subList.add(candi[i]);
            recursion(result, subList, candi, target - candi[i], i);
            subList.remove(subList.size()-1);
        }
    }
}

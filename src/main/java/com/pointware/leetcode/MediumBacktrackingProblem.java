package com.pointware.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediumBacktrackingProblem {
    public List<String> letterCombinations(String digits) {
        return null;
    }

    public List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();
        generateParenthesis(n, n, "", result);
        return result;
    }

    private void generateParenthesis(int open, int close, String target, List<String> result) {
        if (open > close || open < 0) return;
        if (open == 0 && close == 0) {
            result.add(target);
            return;
        }
        generateParenthesis(open - 1, close, target + "(", result);
        generateParenthesis(open, close - 1, target + ")", result);
    }

    public List<List<Integer>> permute(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        var visits = new boolean[nums.length];
        permute(nums, new ArrayList<>(), visits, result);
        return result;
    }

    private void permute(int[] nums, List<Integer> list, boolean[] visits, List<List<Integer>> result) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (visits[i]) continue;
            visits[i] = true;
            list.add(nums[i]);
            permute(nums, list, visits, result);
            list.remove(list.size() - 1);
            visits[i] = false;
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        result.add(Collections.emptyList());
//        for (int i = 1; i <= nums.length; i++) {
        subsets(nums, 0, nums.length, new ArrayList<>(), result);
//        }
        return result;
    }

    private void subsets(int[] nums, int i, int size, List<Integer> list, ArrayList<List<Integer>> result) {
        if (size == 0) {
            return;
        }
        for (; i < nums.length; i++) {
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            subsets(nums, i + 1, size - 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}

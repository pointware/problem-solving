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
        subsets(nums, 0, nums.length, new ArrayList<>(), result);
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

    public boolean exist(char[][] board, String word) {
        boolean[][] visits = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exists(board, visits, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exists(char[][] board, boolean[][] visits,
                          int row, int col,
                          int index, String word) {
        if (row < 0 || row > board.length - 1 ||
                col < 0 || col > board[0].length - 1) return false;
        if (visits[row][col] || board[row][col] != word.charAt(index)) return false;
        if (index == word.length() - 1) return true;
        visits[row][col] = true;
        var result =
                exists(board, visits, row - 1, col, index + 1, word) ||
                        exists(board, visits, row + 1, col, index + 1, word) ||
                        exists(board, visits, row, col - 1, index + 1, word) ||
                        exists(board, visits, row, col + 1, index + 1, word);
        visits[row][col] = false;
        return result;
    }
}

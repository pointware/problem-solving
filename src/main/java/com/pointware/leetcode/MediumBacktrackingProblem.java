package com.pointware.leetcode;

import java.util.ArrayList;
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
}

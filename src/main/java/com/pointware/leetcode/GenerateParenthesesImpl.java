package com.pointware.leetcode;

import com.pointware.leetcode.problem.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesImpl implements GenerateParentheses {
    public void generate(List<String> result, int n, int open, int close, String str) {
        System.out.println(str);
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }
        if(open < n){
            generate(result, n, open+1, close, str+"(");
        }
        if(close < open){
            generate(result, n, open, close+1, str+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, n, 0, 0, "");
        return result;
    }
}

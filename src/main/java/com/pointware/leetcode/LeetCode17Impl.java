package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode17Impl implements LeetCode17 {
    @Override
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('2', List.of('a', 'b', 'c'));
        map.put('3', List.of('d', 'e', 'f'));
        map.put('4', List.of('g', 'h', 'i'));
        map.put('5', List.of('j', 'k', 'l'));
        map.put('6', List.of('m', 'n', 'o'));
        map.put('7', List.of('p', 'q', 'r', 's'));
        map.put('8', List.of('t', 'u', 'v'));
        map.put('9', List.of('w', 'x', 'y', 'z'));


        combinations(digits.toCharArray(), 0, "", map, result);
        return result;
    }

    public void combinations(char[] digits, int index, String str, Map<Character, List<Character>> map, List<String> result) {
        if (index == digits.length) {
            result.add(str);
            return;
        }
        for (char c : map.get(digits[index])) {
            combinations(digits, index + 1, str + c, map, result);
        }
    }
}

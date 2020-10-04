package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode139;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode139Impl implements LeetCode139 {
    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.size() < 1) return false;
        Boolean[] memo = new Boolean[s.length()];
        Map<Character, List<String>> map = new HashMap<>();
        for (var word : wordDict) {
            var list = map.getOrDefault(word.charAt(0), new ArrayList<String>());
            list.add(word);
            map.put(word.charAt(0), list);
        }

        final var chars = s.toCharArray();

        return workBreak(chars, 0, map, memo);
    }

    public boolean workBreak(char[] chars, int next, Map<Character, List<String>> map, Boolean[] memo) {
        if (next == chars.length) return true;
        if (memo[next] != null) {
            return memo[next];
        }
        boolean result = false;
        if (map.containsKey(chars[next])) {
            final var wordList = map.get(chars[next]);
            for (var word : wordList) {
                if (isSegment(chars, next, word)) {
                    if (workBreak(chars, next + word.length(), map, memo)) {
                        result = true;
                    }
                }
            }
        }
        return memo[next] = result;
    }

    private boolean isSegment(char[] chars, int start, String subject) {
        int index = 0;
        while (index < subject.length() && start + index < chars.length) {
            if (subject.charAt(index) != chars[start + index]) {
                return false;
            }
            index++;
        }
        return index == subject.length();
    }
}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode3;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3Impl implements LeetCode3 {
    @Override
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        Set<Character> map = new HashSet<>();
        var chars = s.toCharArray();
        for (char c : chars) {
            //삭제 -> 포인트 이동
            if (map.contains(c)) {
                while (chars[start] != c) {
                    map.remove(chars[start++]);
                }
                if (chars[start] == c) {
                    map.remove(chars[start++]);
                }
            }
            map.add(c);
            //추가

            max = Math.max(map.size(), max);
            //갱신
        }

        return max;
    }
}

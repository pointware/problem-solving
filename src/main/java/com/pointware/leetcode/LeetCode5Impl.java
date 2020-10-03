package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode5;

public class LeetCode5Impl implements LeetCode5 {
    @Override
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        final var chars = s.toCharArray();
        final var odd = oddPalindrome(chars);
        final var even = evenPalindrome(chars);

        return odd.length() > even.length() ? odd : even;
    }

    private String evenPalindrome(char[] chars) {
        final int len = chars.length - 1;
        int maxLen = 0;
        int maxLeftPoint = -1;
        for (int point = 0; point < len; point++) {
            int leftPoint = point;
            int rightPoint = point + 1;
            int lpMax = -1;
            int rpMax = -1;
            while (leftPoint >= 0 && rightPoint <= len && chars[leftPoint] == chars[rightPoint]) {
                lpMax = leftPoint;
                rpMax = rightPoint;
                leftPoint--;
                rightPoint++;
            }
            if (rpMax > 0) {
                int tempLen = rpMax - lpMax + 1;
                if (maxLen < tempLen) {
                    maxLen = tempLen;
                    maxLeftPoint = lpMax;
                }
            }
        }
        if (maxLen > 0) {
            return new String(chars).substring(maxLeftPoint, maxLeftPoint+maxLen);
        } else {
            return "";
        }
    }

    private String oddPalindrome(char[] chars) {
        final int len = chars.length - 1;
        int maxLen = 0;
        int maxLeftPoint = -1;
        for (int point = 0; point < len; point++) {
            int leftPoint = point - 1;
            int rightPoint = point + 1;
            int lpMax = point;
            int rpMax = point;
            while (leftPoint >= 0 && rightPoint <= len && chars[leftPoint] == chars[rightPoint]) {
                lpMax = leftPoint;
                rpMax = rightPoint;
                leftPoint--;
                rightPoint++;
            }
            int tempLen = rpMax - lpMax + 1;
            if (maxLen < tempLen) {
                maxLen = tempLen;
                maxLeftPoint = lpMax;
            }
        }
        if (maxLen > 0) {
            return new String(chars).substring(maxLeftPoint, maxLeftPoint + maxLen);
        } else {
            return "";
        }
    }
}


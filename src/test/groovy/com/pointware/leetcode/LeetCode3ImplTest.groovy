package com.pointware.leetcode

import spock.lang.Specification

class LeetCode3ImplTest extends Specification {
    def "LengthOfLongestSubstring"() {
        expect:
        new LeetCode3Impl().lengthOfLongestSubstring(input) == output

        where:
        input      | output
        "abcabcbb" | 3
        "bbbbb"    | 1
        "pwwkew"   | 3
        "" | 0

    }
}

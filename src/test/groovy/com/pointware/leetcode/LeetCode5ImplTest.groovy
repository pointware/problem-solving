package com.pointware.leetcode

import spock.lang.Specification

class LeetCode5ImplTest extends Specification {
    def "LongestPalindrome"() {
        expect:
        new LeetCode5Impl().longestPalindrome(input) == output
//        new LeetCode5ImplDP().longestPalindrome(input) == output

        where:
        input   | output
        "babab" | "babab"
        "cabbad"  | "abba"
        "ac" | "a"
        "a" | "a"
        "cbbd"  | "bb"
    }
}

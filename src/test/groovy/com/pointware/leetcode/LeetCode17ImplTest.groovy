package com.pointware.leetcode

import spock.lang.Specification

class LeetCode17ImplTest extends Specification {
    def "LetterCombinations"() {
        expect:
        new LeetCode17Impl().letterCombinations(input) == output as List<String>

        where:
        input | output
        ""    | []
        "23"  | ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    }
}

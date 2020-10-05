package com.pointware.leetcode

import spock.lang.Specification

class LeetCode1079ImplTest extends Specification {
    def "NumTilePossibilities"() {
        expect:
        new LeetCode1079Impl().numTilePossibilities(input) == output
        where:
        input    | output
        "AAB"    | 8
        "ABC"    | 15
        "AAABBC" | 188
        "V"      | 1
    }
}

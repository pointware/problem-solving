package com.pointware.leetcode

import spock.lang.Specification

class LeetCode279ImplTest extends Specification {
    def "NumSquares"() {
        expect:
        new LeetCode279Impl().numSquares(input) == output

        where:
        input | output
        12    | 3
        13    | 2
    }
}

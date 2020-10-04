package com.pointware.leetcode

import spock.lang.Specification

class LeetCode300ImplTest extends Specification {
    def "LengthOfLIS"() {
        expect:
        new LeetCode300Memo().lengthOfLIS(input as int[]) == output
        where:
        input                                             | output
        [10, 9, 2, 5, 3, 4]                               | 3
        [10, 9, 2, 5, 3, 7, 101, 18]                      | 4
    }

    def "LengthOfLISDp"() {
        expect:
        new LeetCode300Dp().lengthOfLIS(input as int[]) == output
        where:
        input                                             | output
        [10, 9, 2, 5, 3, 4]                               | 3
        [10, 9, 2, 5, 3, 7, 101, 18]                      | 4
    }
}

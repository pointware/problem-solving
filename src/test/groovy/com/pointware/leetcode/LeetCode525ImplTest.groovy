package com.pointware.leetcode

import spock.lang.Specification

class LeetCode525ImplTest extends Specification {
    def "FindMaxLength"() {
        expect:
        new LeetCode525Impl().findMaxLength(nums as int[]) == expect

        where:
        nums                                 | expect
        [0, 1, 0, 1, 0, 1, 1, 0]             | 8
        [1, 1, 1, 0]                         | 2
        [0, 0, 0, 1, 1, 1, 0]                | 6
        [0, 0, 1, 1]                         | 4
        [1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1] | 10
        [0, 1]                               | 2
        [0, 1, 0]                            | 2
        [1, 1, 1, 1, 1, 1, 1, 1]             | 0
    }
}

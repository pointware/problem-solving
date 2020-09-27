package com.pointware.leetcode

import spock.lang.Specification

class LeetCode11ImplTest extends Specification {
    def "MaxArea"() {
        expect:
        new LeetCode11Impl().maxArea(input as int[]) == output

        where:
        input                       | output
        [1, 3, 2, 5, 25, 24, 5]     | 24
        [1, 2, 4, 3]                | 4
        [1, 8, 6, 2, 5, 4, 8, 3, 7] | 49
        [1, 1, 1, 1, 2]             | 4

    }
}

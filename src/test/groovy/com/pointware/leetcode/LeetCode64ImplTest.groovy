package com.pointware.leetcode

import spock.lang.Specification

class LeetCode64ImplTest extends Specification {
    def "MinPathSum"() {
        expect:
        new LeetCode64Impl().minPathSum(input as int[][]) == expect

        where:
        input | expect
        [
                [1, 3, 1],
                [1, 5, 1],
                [4, 2, 1]
        ]     | 7
    }
}

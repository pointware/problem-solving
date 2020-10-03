package com.pointware.leetcode

import spock.lang.Specification

class LeetCode73ImplTest extends Specification {
    def "SetZeroes"() {
        expect:
        new LeetCode73Impl().callSetZeros(input as int[][]) == output

        where:
        input                                      | output
        [[1, 1, 1], [1, 0, 1], [1, 1, 1]]          | [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
        [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]] | [[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]
    }
}

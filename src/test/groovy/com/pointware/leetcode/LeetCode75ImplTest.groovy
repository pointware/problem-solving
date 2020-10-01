package com.pointware.leetcode

import spock.lang.Specification

class LeetCode75ImplTest extends Specification {
    def "SortColors"() {
        expect:
        new LeetCode75Impl().sortColors(input as int[]) == output as int[]

        where:
        input              | output
        [1, 2, 0]          | [0, 1, 2]
        [2, 0, 2, 1, 1, 0] | [0, 0, 1, 1, 2, 2]
        [2, 0, 1]          | [0, 1, 2]
        []                 | []
        [1]                | [1]
        [0]                | [0]
        [2]                | [2]
        [1, 2]             | [1, 2]
    }
}

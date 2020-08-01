package com.pointware.leetcode

import spock.lang.Specification

class LeetCode954SolutionTest extends Specification {
    def "CanReorderDoubled"() {
        expect:
        new LeetCode954Solution().canReorderDoubled(input as int[]) == expect

        where:
        input               | expect
        [1,2,1,-8,8,-4,4,-4,2,-2] | true
//        [2,1,2,1,1,1,2,2] | true
//        [4, -2, 2, -4]      | true
//        [3, 1, 3, 6]        | false
//        [1, 2, 4, 8]        | true
//        [2, 1, 2, 6]        | false
//        [1, 2, 4, 16, 8, 4] | false
    }
}

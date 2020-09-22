package com.pointware.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class LeetCode62ImplTest extends Specification {
    @Unroll
    def "UniquePaths"() {
        expect:
        output == new LeetCode62Impl().uniquePaths(input1, input2)

        where:
        input1 | input2 | output
        7 | 3 | 28
        3 | 2 | 3
    }
}

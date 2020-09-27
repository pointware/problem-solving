package com.pointware.leetcode

import spock.lang.Specification

class LeetCode454ImplTest extends Specification {
    def "FourSumCount"() {
        expect:
        new LeetCode454Impl().fourSumCount(input1 as int[], input2 as int[], input3 as int[], input4 as int[]) == expect
        where:
        input1 | input2   | input3  | input4 | expect
        [1, 2] | [-2, -1] | [-1, 2] | [0, 2] | 2
    }

    def "FourSumCount_new"() {
        expect:
        new LeetCode454Impl2().fourSumCount(input1 as int[], input2 as int[], input3 as int[], input4 as int[]) == expect
        where:
        input1 | input2   | input3  | input4 | expect
        [1, 2] | [-2, -1] | [-1, 2] | [0, 2] | 2
    }
}

package com.pointware.leetcode

import spock.lang.Specification

class LeetCode41ImplTest extends Specification {
    def "FirstMissingPositive"() {
        expect:
        new LeetCode41Impl().firstMissingPositive(input as int[]) == expect

        where:
        cause | input | expect
        'all minus' | [-1] | 1
        'time limited' | [1,1] | 2
        '' | [1,2,3] | 4
        '' | [1,2,0] | 3
        '' | [3,4,-1,1] | 2
        '' | [7,8,9,11,12] | 1
    }
}

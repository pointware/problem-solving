package com.pointware.leetcode

import spock.lang.Specification

class LeetCode215ImplTest extends Specification {
    def "FindKthLargest"() {
        expect:
        new LeetCode215Impl().findKthLargest(input1 as int[], input2) == expect

        where:
        input1 | input2 | expect
        [3,2,3,1,2,4,5,5,6] | 4 | 4
        [3,2,1,5,6,4] | 2 | 5
        [1,2,3] | 1 | 3
        [3,2,1] | 2 | 2
    }
}

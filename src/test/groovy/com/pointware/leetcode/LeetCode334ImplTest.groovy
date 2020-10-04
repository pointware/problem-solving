package com.pointware.leetcode

import spock.lang.Specification

class LeetCode334ImplTest extends Specification {
    def "IncreasingTriplet"() {
        expect:
        new LeetCode334Impl().increasingTriplet(input as int[]) == output
        where:
        input | output
        [1,2,3,4,5] | true
        [5,4,3,2,1] | false
        [] | false
        [1,1,1] | false
    }
}

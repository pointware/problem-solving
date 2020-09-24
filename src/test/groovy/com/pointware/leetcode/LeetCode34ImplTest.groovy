package com.pointware.leetcode

import spock.lang.Specification

class LeetCode34ImplTest extends Specification {

    def subject = new LeetCode34Impl()

    def "BinarySearch"() {
        when:
        def result = subject.binarySearch(input as int[], target, type)

        then:
        result == expect

        where:
        input | target | type | expect
        [1,1,1,1,1,1,2,5] | 2 | 0 | 6
        [1,1,1,1,1,1,2,5] | 0 | 0 | -1
        [1,1,1,1,1,1,2,5] | 5 | 1 | 7
        [1,1,1,1,1,1,2,5] | 6 | 1 | -1
    }

    def "SearchRange"() {
        when:
        def result = subject.searchRange(input as int[], target)

        then:
        result == expect

        where:
        input | target | expect
        [5,7,7,8,8,10] | 8 | [3,4]
        [5,7,7,8,8,10] | 6 | [-1,-1]
    }
}

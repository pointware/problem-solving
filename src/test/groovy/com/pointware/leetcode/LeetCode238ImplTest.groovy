package com.pointware.leetcode

import spock.lang.Specification

class LeetCode238ImplTest extends Specification {
    def subject = new LeetCode238Impl();

    def "ProductExceptSelf"() {
        expect:
        subject.productExceptSelf(input as int[]) == expect as int[]
        where:
        input        | expect
        [1, 2, 3, 4] | [24, 12, 8, 6]
    }
}

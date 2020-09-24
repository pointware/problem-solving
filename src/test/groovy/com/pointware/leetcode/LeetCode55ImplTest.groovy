package com.pointware.leetcode

import spock.lang.Specification

class LeetCode55ImplTest extends Specification {
    def "CanJump"() {
        setup:
        def subject = new LeetCode55Impl();

        expect:
        subject.canJump(input as int[]) == expect

        where:
        input | expect
        [3,2,1,0,4] | false
        [2,3,1,1,4] | true
        [1] | true
        [1,0] | true
        [0] | true
        [0,0] | false
    }
}

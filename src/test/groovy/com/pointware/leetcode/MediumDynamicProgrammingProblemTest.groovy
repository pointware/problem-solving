package com.pointware.leetcode

import spock.lang.Specification

class MediumDynamicProgrammingProblemTest extends Specification {
    def subject = new MediumDynamicProgrammingProblem();

    def "CanJump"() {
        expect:
        subject.canJump(nums as int[]) == output

        where:
        nums               | output
        [2, 3, 1, 1, 4]    | true
        [3, 2, 1, 0, 4]    | false
        [1, 0, 0, 0, 1, 1] | false
    }

    def "uniquePaths"() {
        expect:
        subject.uniquePaths(m, n) == output

        where:
        m | n | output
        3 | 7 | 28
        7 | 3 | 28
        3 | 3 | 6
    }
}

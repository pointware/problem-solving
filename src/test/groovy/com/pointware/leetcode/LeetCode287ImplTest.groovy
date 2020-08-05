package com.pointware.leetcode

import com.pointware.leetcode.LeetCode287Impl
import spock.lang.Specification

class LeetCode287ImplTest extends Specification {
    def "FindDuplicate"() {
        expect:
        new LeetCode287Impl().findDuplicate(input as int[]) == expect
        where:
        input | expect
        [2,5,9,6,9,3,8,9,7,1] | 9
        [1,3,4,2,2] | 2
        [3,1,3,4,2] | 3
        [3,1,3,3,3] | 3
        [1,1,1,1,1] | 1
    }
}

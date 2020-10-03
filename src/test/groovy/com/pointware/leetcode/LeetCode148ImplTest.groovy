package com.pointware.leetcode

import com.pointware.leetcode.util.ListNode
import spock.lang.Specification

class LeetCode148ImplTest extends Specification {
    def "SortList"() {
        expect:
        new LeetCode148Impl().sortList(input) == output

        where:
        input                                     | output
        ListNode.fromArray([4, 2, 1, 3] as int[]) | ListNode.fromArray([1, 2, 3, 4] as int[])
        ListNode.fromArray([-1,5,3,4,0] as int[]) | ListNode.fromArray([-1,0,3,4,5] as int[])
    }
}

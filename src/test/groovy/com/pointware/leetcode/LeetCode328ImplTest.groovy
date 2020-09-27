package com.pointware.leetcode

import com.pointware.leetcode.util.ListNode
import spock.lang.Specification

class LeetCode328ImplTest extends Specification {
    def "OddEvenList"() {
        expect:
        new LeetCode328Impl().oddEvenList(input) == output

        where:
        input                                     | output
        ListNode.fromArray([] as int[])       | ListNode.fromArray([] as int[])
        ListNode.fromArray([1] as int[])       | ListNode.fromArray([1] as int[])
        ListNode.fromArray([1, 2] as int[])       | ListNode.fromArray([1, 2] as int[])
        ListNode.fromArray([1, 2, 3] as int[])       | ListNode.fromArray([1, 3, 2] as int[])
        ListNode.fromArray([1, 2, 3, 4, 5] as int[])       | ListNode.fromArray([1, 3, 5, 2, 4] as int[])
        ListNode.fromArray([2, 1, 3, 5, 6, 4, 7] as int[]) | ListNode.fromArray([2, 3, 6, 7, 1, 5, 4] as int[])
    }
}

package com.pointware.leetcode

import com.pointware.leetcode.entity.ListNode
import spock.lang.Specification

class RemoveNthFromEndTest extends Specification {
    def subject = new RemoveNthFromEnd();
    def "#description"() {
        when:
        def result = subject.removeNthFromEnd(input1, input2)

        then:
        result.toList() == expect.toList()

        where:
        description | input1 | input2 | expect
        "실패2" | ListNode.fromArray([1,2] as int[]) | 1 | ListNode.fromArray([1] as int[])
        "기본" | ListNode.fromArray([1,2,3,4,5] as int[]) | 2 | ListNode.fromArray([1,2,3,5] as int[])
        "처음일때" | ListNode.fromArray([1,2,3,4,5] as int[]) | 5 | ListNode.fromArray([2,3,4,5] as int[])
        "마지막일때" | ListNode.fromArray([1,2,3,4,5] as int[]) | 1 | ListNode.fromArray([1,2,3,4] as int[])
        "실패1" | ListNode.fromArray([1,2,3] as int[]) | 1 | ListNode.fromArray([1,2] as int[])
        "실패3" | ListNode.fromArray([1,2] as int[]) | 2 | ListNode.fromArray([2] as int[])

    }
}



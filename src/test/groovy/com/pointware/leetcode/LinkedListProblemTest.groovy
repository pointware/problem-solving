package com.pointware.leetcode

import com.pointware.leetcode.util.ListNode
import spock.lang.Specification

class LinkedListProblemTest extends Specification {
    def subject = new LinkedListProblem();

    def "OddEvenList"() {
        expect:
        subject.oddEvenList(ListNode.fromArray(input as int[])) == ListNode.fromArray(output as int[])

        where:
        input           | output
        [1, 2, 3, 4, 5] | [1, 3, 5, 2, 4]
    }
}

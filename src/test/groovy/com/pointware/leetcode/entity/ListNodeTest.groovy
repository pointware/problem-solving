package com.pointware.leetcode.entity

import com.pointware.leetcode.util.ListNode
import spock.lang.Specification

class ListNodeTest extends Specification {

    def "fromArray"() {
        when:
        def result = ListNode.fromArray([1, 2] as int[])
        then:
        result.toList() == [1,2] as List<Integer>
    }

    def "ToList"() {
        setup:
        def head = new ListNode(1);
        head.next = new ListNode(2);

        when:
        def result = head.toList();

        then:
        result.toArray(new int[0]) as int[] == [1,2] as int[]
    }
}

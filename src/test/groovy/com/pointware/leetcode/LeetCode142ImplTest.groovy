package com.pointware.leetcode

import com.pointware.leetcode.util.ListNode
import spock.lang.Specification

class LeetCode142ImplTest extends Specification {
    def "DetectCycle"() {
        setup:
        def node = ListNode.fromArray([1,2] as int[]);
        node.next.next = node;

        expect:
        new LeetCode142Impl().detectCycle(node).val == node.val

    }
}

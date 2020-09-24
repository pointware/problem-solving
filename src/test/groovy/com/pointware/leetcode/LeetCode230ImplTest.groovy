package com.pointware.leetcode

import com.pointware.leetcode.util.TreeNode
import spock.lang.Specification

class LeetCode230ImplTest extends Specification {

    def subject = new LeetCode230Impl();

    def "KthSmallest"() {
        expect:
        subject.kthSmallest(node, k) == expect

        where:
        node                                            | k | expect
        TreeNode.create([3, 1, 4, null, 2])             | 1 | 1
        TreeNode.create([5, 3, 6, 2, 4, null, null, 1]) | 3 | 3
    }
}

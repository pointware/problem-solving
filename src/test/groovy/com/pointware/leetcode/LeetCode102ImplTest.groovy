package com.pointware.leetcode

import com.pointware.leetcode.util.TreeNode
import spock.lang.Specification

class LeetCode102ImplTest extends Specification {
    def "LevelOrder"() {
        setup:
        def tree = TreeNode.create(input as List<Integer>)

        when:
        def result = new LeetCode102Impl().levelOrder(tree)

        then:
        result == output
        
        where:
        input                         | output
        [3, 9, 20, null, null, 15, 7] | [[3], [9, 20], [15, 7]]
    }
}

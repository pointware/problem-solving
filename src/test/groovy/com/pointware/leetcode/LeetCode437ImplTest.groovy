package com.pointware.leetcode

import com.pointware.leetcode.util.TreeNode
import spock.lang.Specification

class LeetCode437ImplTest extends Specification {

    def test() {
        expect:
        new LeetCode437Impl().pathSum(root, sum) == expect

        where:
        root                                                         | sum | expect
        TreeNode.create([1, -2, -3, 1, 3, -2, null, -1])             | 3   | 1
        TreeNode.create([10, 5, -3, 3, 2, null, 11, 3, -2, null, 1]) | 8   | 3
        TreeNode.create([10])                                        | 10  | 1
        TreeNode.create([10])                                        | 2   | 0

    }
}

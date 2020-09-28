package com.pointware.leetcode

import com.pointware.leetcode.util.TreeNode
import spock.lang.Specification

class LeetCode105ImplTest extends Specification {
    def "BuildTree"() {
        expect:
        new LeetCode105Impl().buildTree(preorder as int[], inorder as int[]) == output

        where:
        preorder  | inorder   | output
        [1, 2]    | [2, 1]    | TreeNode.create([1, 2])
        [1, 2]    | [1, 2]    | TreeNode.create([1, null, 2])
        [1, 2, 3] | [3, 2, 1] | TreeNode.create([1, 2, null, 3])
//        [3, 9, 20, 15, 7] | [9, 3, 15, 20, 7] | TreeNode.create([3, 9, 20, null, null, 15, 7])
    }
}

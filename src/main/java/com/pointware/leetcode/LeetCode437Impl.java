package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode437;
import com.pointware.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode437Impl implements LeetCode437 {
    @Override
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        int val = sum - node.val;
        int count = val == 0 ? 1 : 0;
        count += helper(node.left, val) + helper(node.right, val);
        return count;
    }
}

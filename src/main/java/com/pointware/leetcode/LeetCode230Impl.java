package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode230;
import com.pointware.leetcode.util.TreeNode;

import java.util.Stack;

public class LeetCode230Impl implements LeetCode230 {
    @Override
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int count = k;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            count--;
            if (count == 0) {
                break;
            }
            node = node.right;
        }
        return node.val;
    }

}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode102;
import com.pointware.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102Impl implements LeetCode102 {
    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        int count = 1;

        while (treeNodeQueue.size() > 0) {
            int newCount = 0;
            List<Integer> depthArr = new ArrayList<>();
            while (count > 0) {
                final var treeNode = treeNodeQueue.poll();
                count--;

                depthArr.add(treeNode.val);
                if (treeNode.left != null) {
                    treeNodeQueue.add(treeNode.left);
                    newCount++;
                }
                if (treeNode.right != null) {
                    treeNodeQueue.add(treeNode.right);
                    newCount++;
                }
            }
            result.add(depthArr);
            count = newCount;
        }
        return result;
    }
}

package com.pointware.leetcode.util;

import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode create(List<Integer> values) {
        return create(values, 0);
    }

    private static TreeNode create(List<Integer> values, int index) {
        if (values.size() == 0) {
            return new TreeNode();
        }
        if (index >= values.size() || values.get(index) == null) {
            return null;
        }
        return new TreeNode(values.get(index),
                create(values, index * 2 + 1),
                create(values, index * 2 + 2)
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TreeNode) {
            final var target = (TreeNode) obj;
            return target.val == this.val &&
                    (target.left == null && this.left == null || target.left.equals(this.left)) &&
                    (target.right == null && this.right == null || target.right.equals(this.right));
        }
        return false;
    }
}

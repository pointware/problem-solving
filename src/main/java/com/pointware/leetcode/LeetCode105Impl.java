package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode105;
import com.pointware.leetcode.util.TreeNode;

public class LeetCode105Impl implements LeetCode105 {
    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return internalBuildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode internalBuildTree(int[] preorder, int[] inorder,
                                      int preStart, int preEnd,
                                      int inStart, int inEnd
    ) {
        var treeRoot = new TreeNode(preorder[preStart]);
        var root = preorder[preStart];

        if (preStart == preEnd) {
            return treeRoot;
        }

        var rootIndex = inStart;
        for (; rootIndex <= inEnd && inorder[rootIndex] != root; rootIndex++) {
        }
        final var leftTreeSize = rootIndex - inStart;
        final var rightTreeSize = inEnd - rootIndex;
        if (leftTreeSize > 0) {
            treeRoot.left = internalBuildTree(preorder, inorder,
                    preStart + 1, preStart + leftTreeSize,
                    inStart, rootIndex - 1);
        }
        if (rightTreeSize > 0) {
            treeRoot.right = internalBuildTree(preorder, inorder,
                    preStart + leftTreeSize + 1, preEnd,
                    rootIndex + 1, rootIndex + rightTreeSize);
        }


        return treeRoot;
    }
}

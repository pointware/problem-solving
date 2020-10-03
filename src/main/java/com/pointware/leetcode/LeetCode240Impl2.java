package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode240;

public class LeetCode240Impl2 implements LeetCode240 {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (target < matrix[row][col]) {
                row--;
            } else if (target > matrix[row][col]) {
                col++;
            } else {
                return true;
            }
        }
        return false;
    }
}

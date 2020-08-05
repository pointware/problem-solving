package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode240;

/**
 *
 */
public class LeetCode240Solution implements LeetCode240 {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length-1;
        while(col >= 0 && row <= matrix.length -1){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode36;

import java.util.Arrays;

public class LeetCode36Impl implements LeetCode36 {
    @Override
    public boolean isValidSudoku(char[][] board) {
        int[][] colCheck = new int[10][10];
        int[][] boxCheck = new int[3][10];
        int[] rowCheck = new int[10];

        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') {
                    continue;
                }

                final var value = board[row][col] - '0';
                //row check
                if (rowCheck[value] == 0) {
                    rowCheck[value] = 1;
                } else {
                    return false;
                }

                //colcheck
                if (colCheck[col][value] == 0) {
                    colCheck[col][value] = 1;
                } else {
                    return false;
                }
                //boxcheck
                int boxNumber = col / 3;
                if (boxCheck[boxNumber][value] == 0) {
                    boxCheck[boxNumber][value] = 1;
                } else {
                    return false;
                }
            }
            //row check init
            Arrays.fill(rowCheck, 0);
            // smallCheck check init
            if ((row + 1) % 3 == 0) {
                for (int i = 0; i < 3; i++) {
                    Arrays.fill(boxCheck[i], 0);
                }
            }
        }
        return true;
    }
}

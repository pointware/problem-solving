package com.pointware.leetcode;

import java.util.Arrays;

public class SurroundedRegions {
    private static void checkFlip(int row, int col, char[][] board, int[][] visited, boolean border){
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
            return;
        }
        if(board[row][col] == 'O' && visited[row][col] != 1){
            if(!border) board[row][col] = 'X';
            visited[row][col] = 1;
            checkFlip(row-1, col, board, visited, border);
            checkFlip(row+1, col, board, visited, border);
            checkFlip(row, col-1, board, visited, border);
            checkFlip(row, col+1, board, visited, border);
        }
    }

    private static void borderIteration(char[][] board, int[][] visited){
        int rowMax = board.length-1;
        int colMax = board[0].length-1;
        for(int i=0; i <= rowMax; i++){
            checkFlip(i, 0, board, visited, true);
            checkFlip(i, colMax, board, visited, true);
        }
        for(int i=0; i <= colMax; i++){
            checkFlip(0, i, board, visited, true);
            checkFlip(rowMax, i, board, visited, true);
        }
    }

    public static void solve(char[][] board) {
        if(board.length == 0) return;
        int row = board.length;
        int col = board[0].length;
        int[][] temp = new int[row][col];
        for(int i=0; i< row; i++)
            Arrays.fill(temp[i], 0);

        borderIteration(board, temp);
        for(int i=1; i<row-1; i++){
            for(int j=1; j<col-1;j++){
                if(board[i][j] == 'O'){
                    checkFlip(i, j, board, temp, false);
                }
            }
        }
    }
}

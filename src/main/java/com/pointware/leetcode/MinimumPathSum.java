package com.pointware.leetcode;

import java.util.Arrays;

public class MinimumPathSum {

    private void iteration(int[][] grid, int[][] sum, int beforeValue, int x, int y){
        if(x < 0 || x == grid[0].length) return;
        if(y < 0 || y == grid.length) return;
        sum[y][x] = Math.min(beforeValue + grid[y][x], sum[y][x]);
        iteration(grid, sum, sum[y][x], x+1, y);
        iteration(grid, sum, sum[y][x], x, y+1);
    }

    public int dp(int[][] grid){
        int height = grid.length;
        int width = grid[0].length;
        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                if(row == 0 && col == 0) continue;
                else if(row != 0 && col == 0) grid[row][col] = grid[row-1][col]+ grid[row][col];
                else if(row == 0 && col != 0) grid[row][col] = grid[row][col-1] + grid[row][col];
                else grid[row][col] = grid[row][col] + Math.min(grid[row-1][col], grid[row][col-1]);
            }
        }
        return grid[height-1][width-1];
    }

    public int minPathSum(int[][] grid) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[][] minSum = new int[rowLength][];

        for(int i=0; i< rowLength; i++){
            minSum[i] = new int[colLength];
            Arrays.fill(minSum[i], Integer.MAX_VALUE);
        }
        minSum[0][0] = grid[0][0];
        iteration(grid, minSum, minSum[0][0], 0, 0);
        return minSum[rowLength-1][colLength-1];
    }
}

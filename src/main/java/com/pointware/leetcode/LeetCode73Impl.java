package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode73;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode73Impl implements LeetCode73 {
    @Override
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        final var rowIterator = rows.iterator();
        while (rowIterator.hasNext()) {
            int row = rowIterator.next();
            for(int i=0; i< matrix[0].length; i++){
                matrix[row][i] = 0;
            }
        }
        if (rows.size() == matrix.length) {
            return;
        }
        final var colIterator = cols.iterator();
        while (colIterator.hasNext()) {
            int col = colIterator.next();
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }

    public int[][] callSetZeros(int[][] matrix) {
        setZeroes(matrix);
        return matrix.clone();
    }
}

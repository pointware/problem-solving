package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode200Impl implements LeetCode200 {
    @Override
    public int numIslands(char[][] grid) {
        List<Set<String>> pairSetList = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    var set = getOrNewPairSet(pairSetList, i + "/" + j);
                    move(grid, i, j, set);
                }
            }
        }
        return pairSetList.size();
    }
    
    private void move(char[][] grid, int x, int y, Set<String> pairSet) {
        String pair = x + "/" + y;
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0'
                || pairSet.contains(pair)
        ) {
            return;
        }
        pairSet.add(pair);
        grid[x][y] = '0';
        move(grid, x - 1, y, pairSet);
        move(grid, x + 1, y, pairSet);
        move(grid, x, y - 1, pairSet);
        move(grid, x, y + 1, pairSet);

    }

    private Set<String> getOrNewPairSet(List<Set<String>> pairSetList, String pair) {
        for (var pairSet : pairSetList) {
            if (pairSet.contains(pair))
                return pairSet;
        }
        var newPairSet = new HashSet<String>();
        pairSetList.add(newPairSet);
        return newPairSet;
    }
}

package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode1079;

import java.util.Arrays;

public class LeetCode1079Impl implements LeetCode1079 {
    @Override
    public int numTilePossibilities(String tiles) {
        final var chars = tiles.toCharArray();
        Arrays.sort(chars);
        boolean[] visit = new boolean[tiles.length()];
        return numTilePossibilities(chars, 0, visit);
    }


    public int numTilePossibilities(char[] tiles, int idx, boolean[] visit) {
        int sum = 0;
        if (idx == tiles.length) return 0;
        for (int i = 0; i < tiles.length; i++) {
            if (visit[i]) continue;

            if (i - 1 >= 0 && tiles[i - 1] == tiles[i] && !visit[i - 1]) continue;
            //같은 문자가 존재하는 상황에서, 문자를 선택함에 있어 순서를 고정시키기 위한 용도
            // A1 A2 A3 => [A1, A2, A3] == [A2, A3, A1]
            // 순서를 무시하기 위한 방법

            visit[i] = true;
            sum++;
            sum += numTilePossibilities(tiles, i, visit);
            visit[i] = false;
        }
        return sum;
    }
}

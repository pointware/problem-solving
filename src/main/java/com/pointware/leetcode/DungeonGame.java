package com.pointware.leetcode;

import java.util.Arrays;

public class DungeonGame {

    public void iterateMap(int startX, int startY, int[][] minimumHP, int[][] dungeon, int[][] travelSum){
        // RIGHT
        // DOWN
        if(startX == minimumHP[0].length || startY == minimumHP.length){
            return;
        }
        if(minimumHP[startY][startX] == 1){
            minimumHP[startY][startX] = Math.min(dungeon[startY][startX], 0);
        }else{
            if(dungeon[startY][startX] > 0){

            }else if(dungeon[startY][startX] < 0){

            }
        }
        iterateMap(startX+1, startY, minimumHP, dungeon, travelSum);
        iterateMap(startX, startY+1, minimumHP, dungeon, travelSum);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int[][] travelSum = new int[dungeon.length][dungeon[0].length];
        int[][] minimumHP = new int[dungeon.length][dungeon[0].length];

        iterateMap(0, 0, minimumHP, dungeon, travelSum);
        // 마지막까지 갔을때 구간에서 가장 작은 hp를 필요로 하는 것을 찾아야 한다.
        // hp is bigger than 0.
        //  -2  -3  -3
        //  -5  -10 1
        //  10  -30  -5

        // -3   -33

        // -2   -5              -2,
        // -7   (-15, -17),     (-1,-14)
        // 3    (15,33)         (-6,
        // minHP
        return 0;
    }
}

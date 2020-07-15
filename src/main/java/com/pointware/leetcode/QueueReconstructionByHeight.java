package com.pointware.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {

        // 이미 정렬되어 있는 상태에서 순서만 조정한다면 쉽게 풀 수 있다.

        Arrays.sort(people, (v1, v2) -> {
            if(v1[0] < v2[0]) return 1;
            else if(v1[0] == v2[0]) {
                return v1[1]-v2[1];
            }
            else return -1;
        });
        List<int[]> linkedList = new LinkedList<>();

        for(int[] person : people){
            linkedList.add(person[1], person);
        }

        return linkedList.toArray(new int[linkedList.size()][]);
    }
}


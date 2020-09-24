package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode454;

import java.util.HashMap;
import java.util.Map;

public class LeetCode454Impl implements LeetCode454 {
    //WARN: TIME LIMIT EXCEEDED
    private int recursion(int[][] subject,
                         int depth,
                         int value){
        if(depth == 4){
            return value == 0? 1 : 0;
        }
        int count = 0;
        for(int i=0; i< subject[depth].length ; i++){
            count += recursion(subject, depth+1, value + subject[depth][i]);
        }
        return count;
    }


    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: A){
            for(int b: B){
                map.compute(a+b, (k, v) -> v == null? 1: v+1);
            }
        }

        for(int c: C){
            for(int d: D){
                result += map.getOrDefault(-(c+d), 0);
            }
        }

        return result;
    }
}

package com.pointware.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderboard {
    static int[] run(int[] scores, int[] alice) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(scores[scores.length-1]);
        for (int i=scores.length-1; i >= 0; i--) {
            if(integerList.get(integerList.size()-1) != scores[i]){
                integerList.add(scores[i]);
            }
        }
        int[] result = new int[alice.length];
        Integer[] reduceArr = integerList.toArray(new Integer[integerList.size()]);
        for(int i=0; i<alice.length; i++){
            int index = Arrays.binarySearch(reduceArr, alice[i]);
            if(index < 0){
                result[i] = integerList.size()+2 +index;
            }else{
                result[i] = reduceArr.length - index;
            }
        }
        return result;
    }
}

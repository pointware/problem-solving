package com.pointware.leetcode;

import java.util.Arrays;

public class HIndex2 {
    public static int hIndex(int[] citations){
        int max = 0;
        int low = 0;
        int high = citations.length - 1;
        int mid = (low+high) / 2;

        while(low <= high){
            int citationCount = citations.length - mid;
            int compareValue;
            if(citations[mid] <= citationCount){
                compareValue = citations[mid];
                low = mid+1;
            }else {
                compareValue = Math.min(citationCount, citations[mid]);
                high = mid-1;
            }
            max = Math.max(max, compareValue);
            mid = (low + high) / 2;
        }
        //연속되는 수...?
        return max;
    }
}

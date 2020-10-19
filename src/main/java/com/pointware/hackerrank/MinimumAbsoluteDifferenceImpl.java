package com.pointware.hackerrank;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceImpl implements MinimumAbsoluteDifference {
    @Override
    public int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i - 1] - arr[i]);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}

package com.pointware.hackerrank;

public class MinimumBribesImpl implements MinimumBribes {
    @Override
    public int minimumBribes(int[] q) {
        int length = q.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (q[i] - (i + 1) > 2) {
                return -1;
            }
        }
        // O(n^2) TODO: fix..
        for (int i = length - 1; i > 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (q[j] > q[i]) count++;
            }
        }
        return count;
    }
}

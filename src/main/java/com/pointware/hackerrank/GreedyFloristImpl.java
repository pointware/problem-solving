package com.pointware.hackerrank;

import java.util.Arrays;

public class GreedyFloristImpl implements GreedyFlorist {
    @Override
    public int getMinimumCost(int k, int[] c) {

        Arrays.sort(c);
        int count = 0;
        int totalCost = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            int temp = count / k;
            count++;
            totalCost += (temp + 1) * c[i];
        }
        return totalCost;
    }
}

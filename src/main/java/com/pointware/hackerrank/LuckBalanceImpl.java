package com.pointware.hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LuckBalanceImpl implements LuckBalance {
    @Override
    public int luckBalance(int k, int[][] contests) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                Comparator.reverseOrder()
        );
        int result = 0;
        for (int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 0) {
                result += contests[i][0];
            } else {
                priorityQueue.add(contests[i][0]);
            }
        }
        while (priorityQueue.size() > 0) {
            if (k > 0) {
                result += priorityQueue.poll();
            } else {
                result -= priorityQueue.poll();
            }
            k--;
        }
        return result;
    }
}

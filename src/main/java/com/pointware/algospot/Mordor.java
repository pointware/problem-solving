package com.pointware.algospot;

import java.util.Arrays;

public class Mordor {
    public static void main(String[] args) {
        int[] a = new int[]{3, 9, 5, 6, 10, 8, 7, 1, 2, 4};
        Pair[] preCalc = new Pair[a.length * 4];
        makePreCalc(preCalc, a, 0, a.length - 1, 1);
        int[] result = new int[]{
                query(preCalc, 1, 6, a.length),
                query(preCalc, 4, 7, a.length),
                query(preCalc, 9, 9, a.length),
                query(preCalc, 5, 8, a.length)};
        System.out.println(Arrays.toString(result));
    }

    private static int query(Pair[] pre, int left, int right, int tableLen) {
        Pair pair = internalQuery(pre, left, right, 0, tableLen - 1, 1);
        return pair.max - pair.min;
    }

    private static Pair internalQuery(Pair[] pre, int left, int right, int nodeLeft, int nodeRight, int node) {
        if (right < nodeLeft || nodeRight < left) {
            return new Pair(Integer.MAX_VALUE, -1);
        }
        if (left <= nodeLeft && nodeRight <= right) {
            return pre[node];
        }
        int mid = (nodeLeft + nodeRight) / 2;
        Pair leftPair = internalQuery(pre, left, right, nodeLeft, mid, node * 2);
        Pair rightPair = internalQuery(pre, left, right, mid + 1, nodeRight, node * 2 + 1);
        return new Pair(Math.min(leftPair.min, rightPair.min), Math.max(leftPair.max, rightPair.max));
    }

    public static Pair makePreCalc(Pair[] preCalc, int[] table, int left, int right, int node) {
        if (left == right) {
            return preCalc[node] = new Pair(table[left], table[left]);
        }
        int mid = (left + right) / 2;
        Pair leftPair = makePreCalc(preCalc, table, left, mid, node * 2);
        Pair rightPair = makePreCalc(preCalc, table, mid + 1, right, node * 2 + 1);
        int min = Math.min(leftPair.min, rightPair.min);
        int max = Math.max(leftPair.max, rightPair.max);
        return preCalc[node] = new Pair(min, max);
    }

    private static class Pair {
        int min;
        int max;

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }
}

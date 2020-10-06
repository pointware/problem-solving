package com.pointware.codility;

import java.util.Collections;

public class Lesson2CyclicRotationImpl implements Lesson2CyclicRotation {
    @Override
    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K % A.length == 0) return A;
        K = K % A.length;
        rightShift(A, K);
        return A;
    }

    private void rightShift(int[] A, int K) {
        int len = A.length - 1;
        int gcd = gcd(A.length, K);
        for (int i = 0; i < gcd; i++) {
            int pos = i;
            int subloop = A.length / gcd - 1;
            while (subloop-- > 0) {
                int next = (A.length + pos - K) % A.length;
                swap(A, pos, next);
                pos = next;
            }
        }
    }

    private int gcd(int a, int b) {
        return a == 0 || b == 0 ? a + b : gcd(b, a % b);
    }

    private void swap(int[] A, int source, int target) {
        int temp = A[source];
        A[source] = A[target];
        A[target] = temp;
    }
}

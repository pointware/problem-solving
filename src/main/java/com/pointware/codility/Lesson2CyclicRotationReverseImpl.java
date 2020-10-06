package com.pointware.codility;

public class Lesson2CyclicRotationReverseImpl implements Lesson2CyclicRotation {
    @Override
    public int[] solution(int[] A, int K) {
        int length = A.length;
        if (length == 0 || K % length == 0) return A;
        K = (length-K) % length;

        reverse(A, 0, K-1);
        reverse(A, K, length-1);
        reverse(A, 0, length-1);

        return A;
    }

    private void reverse(int[] a, int s, int e) {
        int size = e - s;
        int mid = (e + s) >> 1;
        int i = s, j;
        for (j = e; i <= mid; --j) {
            swap(a, i, j);
            ++i;
        }
    }

    private void swap(int[] A, int source, int target) {
        int temp = A[source];
        A[source] = A[target];
        A[target] = temp;
    }
}

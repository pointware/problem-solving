package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {


    private int testbs(int[] arr, int target) {
        // 0 1 2 3 4 5
        // 0 1 2 3 4

        int len = 6;
        int low = 0;
        int high = len - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (mid < 0 || mid > arr.length - 1) break;
            if (target == arr[mid]) {
                return target;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    @Test
    public void traversal() {
        for (int i = 0; i < 6; i++) {
            assertEquals(testbs(new int[]{0, 1, 2, 3, 4, 5}, i), i);
        }

        for (int i = 0; i < 5; i++) {
            assertEquals(testbs(new int[]{0, 1, 2, 3, 4}, i), i);
        }
    }

    @Test
    public void invalid() {
        assertEquals(testbs(new int[]{0, 0, 0, 0}, 1), -1);
        assertEquals(testbs(new int[]{0, 0, 0, 0}, -1), -1);
    }
}

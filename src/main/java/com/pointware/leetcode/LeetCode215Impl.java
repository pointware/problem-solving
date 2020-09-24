package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode215;

public class LeetCode215Impl implements LeetCode215 {

    private void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

    public int find(int[] nums, int left, int right, int k) {
        int pivot = nums[right];
        int leftIndex = left;
        int rightIndex = right;
        while (leftIndex < rightIndex) {
            if (pivot >= nums[leftIndex] && pivot < nums[rightIndex]) {
                swap(nums, leftIndex, rightIndex);
            }
            if (pivot < nums[leftIndex]) {
                leftIndex++;
            } else if (pivot >= nums[rightIndex]) {
                rightIndex--;
            }
        }
        swap(nums, leftIndex, right);
        if (leftIndex + 1 == k) {
            return nums[leftIndex];
        } else if (leftIndex + 1 < k) {
            return find(nums, leftIndex + 1, right, k);
        } else {
            return find(nums, left, rightIndex - 1, k);
        }
    }

    @Override
    public int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, k);
    }
}

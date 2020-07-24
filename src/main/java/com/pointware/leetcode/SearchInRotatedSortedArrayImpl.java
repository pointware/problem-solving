package com.pointware.leetcode;

import com.pointware.leetcode.problem.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArrayImpl implements SearchInRotatedSortedArray {
    private int getPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {

        int pivot = getPivot(nums);
        int start = 0;
        int end = nums.length - 1;
        if (pivot != 0) {
            if (nums[0] <= target && nums[pivot - 1] >= target) {
                start = 0;
                end = pivot - 1;
            } else {
                start = pivot;
                end = nums.length - 1;
            }
        }

        return binarySearch(nums, start, end, target);
    }
}

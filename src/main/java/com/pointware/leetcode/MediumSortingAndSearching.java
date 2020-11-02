package com.pointware.leetcode;

public class MediumSortingAndSearching {
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        int idx = 0;
        while (idx < two) {
            if (nums[idx] == 2) {
                //2가 아닐때까지 쭉 이동
                swap(nums, idx, --two);
            } else {
                if (nums[idx] == 0) {
                    swap(nums, ++zero, idx);
                }
                idx++;
            }
        }
    }

    private void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}

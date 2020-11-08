package com.pointware.leetcode;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        sort(nums, 0, nums.length - 1, k - 1);
        return nums[k - 1];
    }

    public void sort(int[] nums, int start, int end, int k) {
        if (start == end && start == k) return;
        int pivot = nums[end];
        int left = start-1;
        int right = end;
        while (right-left >1) {

            while (left < end && pivot < nums[left+1]) {
                left++;
            }
            while (right > start && pivot >= nums[right-1]) {
                right--;
            }
            if (right-left > 1)
                swap(nums, left+1, right-1);
        }
        swap(nums, end, right);

        if(right == k) return;
        else if(right > k){
            sort(nums, start, right-1, k);
        } else {
            sort(nums, right+1, end, k);
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

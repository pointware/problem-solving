package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {
    @Test
    public void basicTest(){
        int[] nums = {
                2, 0, 2, 1, 1, 0
        };
        SortColors.sortColors(nums);
       assertArrayEquals(nums, new int[] { 0,0,1,1,2,2});
    }

    @Test
    public void onlyOneTest(){
        int[] nums = {
                1,1,1
        };
        SortColors.sortColors(nums);
        assertArrayEquals(nums, new int[] { 1,1,1});
    }

    @Test
    public void zeroOrOneOrTwoLengthTest(){
        int[] nums = {};
        SortColors.sortColors(nums);
        assertArrayEquals(nums, new int[] {});
        int[] nums2 = {1};
        SortColors.sortColors(nums2);
        assertArrayEquals(nums2, new int[] {1});
        int[] nums3 = {2,1};
        SortColors.sortColors(nums3);
        assertArrayEquals(nums3, new int[] {1,2});
    }

    @Test
    public void wrongAnswerTest(){
        int[] nums = {
                2,0,1
        };
        SortColors.sortColors(nums);
        assertArrayEquals(nums, new int[] { 0,1,2});
    }
}

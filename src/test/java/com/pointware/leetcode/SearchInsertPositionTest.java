package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

    @Test
    public void basicTest() {
        assertEquals(SearchInsertPosition.searchInsert(new int[]{
                1, 3, 5, 6
        }, 2), 1);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{
                1, 3, 5, 6
        }, 5), 2);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{
                1, 3, 5, 6
        }, 7), 4);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{
                1, 3, 5, 6
        }, 0), 0);
    }

    @Test
    public void boundTest() {
        assertEquals(SearchInsertPosition.searchInsert(new int[]{}, 5), 0);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{4}, 5), 1);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{7}, 5), 0);
    }

    @Test
    public void failedCoverTest() {

    }

}

package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonGameTest implements TestCase {

    @Test
    @Override
    public void basicTest() {
        assertEquals(new DungeonGame().calculateMinimumHP(new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        }), 7);
    }
}

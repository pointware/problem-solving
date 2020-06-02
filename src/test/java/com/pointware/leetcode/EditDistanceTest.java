package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {

    @Test
    public void basicTest(){
        assertEquals(1, EditDistance.minDistance("horse", "hors"));
        assertEquals(3, EditDistance.minDistance("horse", "ros"));
        assertEquals(4, EditDistance.minDistance("horse", "h"));
        assertEquals(5, EditDistance.minDistance("intention", "execution"));
    }

    @Test
    public void timeLimitTest(){
        assertEquals(5, EditDistance.minDistance("dinitrophenylhydrazine","acetylphenylhydrazine"));
    }
}

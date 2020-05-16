package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void basicTest(){
        assertEquals(JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"), 3);
        assertEquals(JewelsAndStones.numJewelsInStones("z", "ZZ"), 0);
    }
}

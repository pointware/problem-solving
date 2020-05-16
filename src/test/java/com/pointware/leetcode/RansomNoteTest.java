package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RansomNoteTest {

    @Test
    public void basicTest(){
        assertEquals(RansomNote.canConstruct("a","b"), false);
        assertEquals(RansomNote.canConstruct("aa","ab"), false);
        assertEquals(RansomNote.canConstruct("aa","aab"), false);
    }
}

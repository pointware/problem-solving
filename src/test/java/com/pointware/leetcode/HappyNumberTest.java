package com.pointware.leetcode;

import org.junit.Test;

import static com.pointware.leetcode.HappyNumber.isHappy;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    @Test
    public void test(){
        assertTrue(isHappy(19));
    }

    @Test
    public void check_zero(){
        assertFalse(isHappy(0));
    }
}

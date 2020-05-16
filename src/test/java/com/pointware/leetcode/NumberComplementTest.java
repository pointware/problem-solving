package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComplementTest {

    @Test
    public void basicTest(){
        assertEquals(NumberComplement.findComplement(5), 2);
        assertEquals(NumberComplement.findComplement(1), 0);
    }

    @Test
    public void test(){
        assertEquals(NumberComplement.findComplement(16), 15);
        assertEquals(NumberComplement.findComplement(2147483647), 15);
    }
}

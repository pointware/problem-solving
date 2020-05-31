package com.pointware.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {
    @Test
    public void basicTest(){
        int result = MajorityElement.majorityElement(new int[]{
                3,2,3
        });

        assertEquals(result, 3);

        assertEquals(MajorityElement.majorityElement(new int[]{
                2,2,1,1,1,2,2
        }), 2);
    }
}

package com.pointware.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    @Test
    public void basicTest(){
        assertEquals(FirstBadVersion.firstBadVersion(5), 4);
    }

    @Test
    public void min_test(){
        assertEquals(FirstBadVersion.firstBadVersion(5), 1);
    }

    @Test
    public void max_test(){
        assertEquals(FirstBadVersion.firstBadVersion(5), 5);
    }

    @Test
    public void mid_test(){
        assertEquals(FirstBadVersion.firstBadVersion(5), 3);
    }
}

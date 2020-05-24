package com.pointware.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqCharTest {

    @Test
    public void basicTest() {
//        s = "leetcode"
//        return 0.
//
//        s = "loveleetcode",
//        return 2.
//
        Assert.assertEquals(FirstUniqChar.firstUniqChar("leetcode"), 0);
        Assert.assertEquals(FirstUniqChar.firstUniqChar("loveleetcode"), 2);
    }
}

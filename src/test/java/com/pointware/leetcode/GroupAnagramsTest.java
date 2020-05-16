package com.pointware.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void basicTest(){
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        });
        assertArrayEquals(result.get(0).toArray(), new String[]{"eat","tea","ate"});
        assertArrayEquals(result.get(1).toArray(), new String[]{"bat"});
        assertArrayEquals(result.get(2).toArray(), new String[]{"tan","nat"});
    }

    @Test
    public void characterOrdering(){
        char[] chars = new char[]{'b','a','c'};
        Arrays.sort(chars);
        assertArrayEquals(chars, new char[]{'a','b','c'});
    }
}

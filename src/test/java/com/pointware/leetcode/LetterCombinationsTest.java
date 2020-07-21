package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

public class LetterCombinationsTest implements TestCase {
    @Test
    @Override
    public void basicTest() {
        var list = new LetterCombinations().letterCombinations("23");
        System.out.println(list);
    }
}

package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PermutationSequenceTest implements TestCase {
    @Test
    @Override
    public void basicTest() {
        assertEquals("123", new PermutationSequence().getPermutation(3, 1) );
        assertEquals("132", new PermutationSequence().getPermutation(3, 2) );
        assertEquals("213", new PermutationSequence().getPermutation(3, 3) );
        assertEquals("231", new PermutationSequence().getPermutation(3, 4) );
        assertEquals("312", new PermutationSequence().getPermutation(3, 5));
        assertEquals("321", new PermutationSequence().getPermutation(3, 6) );
    }

    @Test
    public void rotateTest() {
        /**
         * 1 2 3
         * 1 3 2
         * 2 1 3
         * 2 3 1
         * 1 2 3 -> 3 1 2
         * 3 2 1
         */
        int[] arr = IntStream.range(1, 4).toArray();
        new PermutationSequence().rotateR(0, 2, arr);
        assertArrayEquals(arr, new int[]{3, 1, 2});
        new PermutationSequence().rotateR(1, 2, arr);
        assertArrayEquals(arr, new int[]{3, 2, 1});
        new PermutationSequence().rotateL(1, 2, arr);
        assertArrayEquals(arr, new int[]{3, 1, 2});
        new PermutationSequence().rotateL(0, 2, arr);
        assertArrayEquals(arr, new int[]{1, 2, 3});
    }

    @Test
    public void timeLimitExceeded() {
        assertEquals("86734512", new PermutationSequence().getPermutation(8, 39545));
    }
}

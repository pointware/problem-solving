package com.pointware.leetcode;

public class NumberComplement {
    public static int findComplement(int num) {
        long pow2 = 2;
        // pow of number 2, must check number range
        while(pow2 <= num){ pow2 = pow2*2; }
        return (int)(pow2 - num) -1;
    }
}

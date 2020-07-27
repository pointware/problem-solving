package com.pointware.leetcode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // CHECK: if counter use integer type, occur overflow.
        // TODO : complement of 2
        long check = 1;
        while(n > check){
            check = check << 1;
        }
        return check == n;
    }
}

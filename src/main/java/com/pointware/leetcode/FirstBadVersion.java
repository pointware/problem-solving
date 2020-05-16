package com.pointware.leetcode;

public class FirstBadVersion {

    /**
     * depend on problem...
     * @param version
     * @return
     */
    private static boolean isBadVersion(int version){
        return version > 3;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int testNumber;
        while(left < right){
            // Be careful, it causes overflow if too large numbers.
            testNumber = left + (right - left) / 2;
            if (isBadVersion(testNumber)) {
                right = testNumber;
            } else {
                left = testNumber+1;
            }
        }
        return left;
    }
}

package com.pointware.codility;

public class Lesson1Impl implements Lesson1 {
    @Override
    public int binaryGap(int N) {
        int maxLen = 0;
        int count = 0;
        int startCount = -1;
        do {
            count++;
            if (N % 2 == 1) {
                if (startCount > -1) {
                    maxLen = Math.max(maxLen, count - startCount - 1);
                }
                startCount = count;
            }
            N = N >> 1;
        } while (N > 0);
        return maxLen;
    }
}

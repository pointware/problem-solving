package com.pointware.hackerrank;

public class MinimumBribesImpl implements MinimumBribes {
    @Override
    public int minimumBribes(int[] q) {
        int length = q.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (q[i] - (i + 1) > 2) {
                return -1;
            }
            // 최대 2칸 내에 존재하는 것들에 대해서 비교한다...
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) count++;
            }
        }

        return count;
    }
}

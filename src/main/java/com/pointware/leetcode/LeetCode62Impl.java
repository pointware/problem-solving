package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode62;

public class LeetCode62Impl implements LeetCode62 {

    public int uniquePath(int m, int n, int i, int j) {
        if (m == i && n == j) {
            System.out.println("");
            return 1;
        }
        if (m <= i || n <= j) return 0;
        int a = 0;
        int mi = i;
        int nj = j;
        a += uniquePath(m, n, ++mi, nj);
        mi--;
        a += uniquePath(m, n, mi, ++nj);
//        nj--;

//        while(mi < m){
//            mi++;
//            a += uniquePath(m, n, mi, j);
//            System.out.print("d");
//        }
//        while(nj < n){
//            nj++;
//            a += uniquePath(m,n, mi, nj);
//            System.out.print("l");
//        }
        return a;
    }

    @Override
    public int uniquePaths(int m, int n) {
        return uniquePath(m, n, 0, 0);
    }
}

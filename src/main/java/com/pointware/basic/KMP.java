package com.pointware.basic;

public class KMP {
    public static void main(String[] args) {
        //부분 일치 테이블 생성하기.
        // a a b a a b a c
        //
        String a = "aabaabac";
        getPartialMatch(a);
    }

    private static int[] getPartialMatch(String a) {
        int size = a.length();
        int[] ret = new int[size];
        int begin = 1;
        int matched = 0;
        char[] str = a.toCharArray();
        while (begin + matched < size) {
            if (str[begin + matched] == str[matched]) {
                matched++;
                ret[begin + matched - 1] = matched;
            } else {
                if (matched == 0)
                    begin++;
                else {
                    begin += matched - ret[matched-1];
                    matched = ret[matched-1];
                }
            }
        }
        return ret;
    }
}

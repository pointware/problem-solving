package com.pointware.leetcode;

public class ReverseString {

    public static void reverseString(char[] s) {
        int len = s.length / 2;
        for(int i=0; i<len; i++){
            int tempIdx = s.length - i - 1;
            if(s[i] != s[tempIdx]){
                char temp = s[i];
                s[i] = s[tempIdx];
                s[tempIdx] = temp;
            }
        }
    }
}

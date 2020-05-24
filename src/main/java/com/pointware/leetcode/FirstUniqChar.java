package com.pointware.leetcode;

import java.util.Arrays;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int index = 0;
        boolean[] charArrCount = new boolean[26];
        int[] charArrIndex = new int[26];

        for(char c : s.toCharArray()){
            int charIndex = c - 'a';
            if(charArrCount[charIndex] == false){
                charArrCount[charIndex] = true;
                charArrIndex[charIndex] = index+1;
            }else{
                charArrIndex[charIndex] = -1;
            }
            index++;
        }

        return Arrays.stream(charArrIndex).filter(o -> o > 0).min().orElse(0)-1;
    }
}

package com.pointware.leetcode;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        char[] charArr = s.toCharArray();
        int index = 0;
        for(char o: t.toCharArray()){
            //source char array out of index
            if(index == charArr.length){
                break;
            }
            if(charArr[index] == o){
                index++;
            }
        }

        return index == charArr.length;
    }
}

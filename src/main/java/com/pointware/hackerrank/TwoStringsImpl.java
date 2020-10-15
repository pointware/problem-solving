package com.pointware.hackerrank;

public class TwoStringsImpl implements TwoStrings {
    @Override
    public String twoStrings(String s1, String s2) {
        int size = 'z' - 'a' + 1;
        char[] counter = new char[size];
        boolean check = false;
        for (char ch : s1.toCharArray()) {
            counter[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            if (!check && counter[ch - 'a'] != 0) {
                check = true;
            }
        }
        return !check? "NO": "YES";
    }
}

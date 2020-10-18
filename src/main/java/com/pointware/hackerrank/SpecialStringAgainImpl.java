package com.pointware.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SpecialStringAgainImpl implements SpecialStringAgain {
    @Override
    public long substrCount(int n, String s) {
        List<Integer> list = getCompactList(s);
        int count = evenString(list);
        count += oddString(list, s);
        return count;
    }

    public List<Integer> getCompactList(String s) {
        List<Integer> list = new ArrayList<>();
        char ch = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                count++;
            } else {
                list.add(count);
                count = 1;
            }
            ch = s.charAt(i);
        }
        list.add(count);
        return list;
    }

    public int oddString(List<Integer> list, String s) {
        int index = 0;
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                result++; // -> single point
                char ch = index - 1 < 0 ? '-' : s.charAt(index - 1);
                for (int j = 1; j <= s.length() / 2; j++) {
                    // 범위를 넘어갔거나.
                    if (index - j < 0 || index + j >= s.length() || s.charAt(index - j) != ch || s.charAt(index + j) != ch)
                        break;
                    else result++;
                }
            }
            index += list.get(i);
        }
        return result;
    }

    public int evenString(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value > 1)
                result += value * (value + 1) / 2;
        }
        return result;
    }
}

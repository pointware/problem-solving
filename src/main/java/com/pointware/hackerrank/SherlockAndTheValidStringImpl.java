package com.pointware.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidStringImpl implements SherlockAndTheValidString {
    @Override
    public String isValid(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int val = characterIntegerMap.getOrDefault(ch, 0);
            characterIntegerMap.put(ch, val + 1);
        }
        for (int val : characterIntegerMap.values()) {
            int count = countMap.getOrDefault(val, 0);
            countMap.put(val, count + 1);
        }
        if (countMap.size() == 1) return "YES";
        if (countMap.size() > 2) return "NO";

        return testMap(countMap) ? "YES" : "NO";
    }

    public boolean testMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 1 && entry.getValue() == 1) {
                return true;
            } else if (map.containsKey(entry.getKey() - 1) && entry.getValue() == 1) {
                return true;
            }
        }
        return false;
    }
}

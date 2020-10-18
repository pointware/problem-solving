package com.pointware.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagramsImpl implements MakingAnagrams {
    @Override
    public int makeAnagram(String a, String b) {
        // cde, dcf
        int count = 0;
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();
        for (char c : a.toCharArray()) {
            int value = aMap.getOrDefault(c, 0);
            aMap.put(c, value + 1);
        }
        for (char c : b.toCharArray()) {
            int value = bMap.getOrDefault(c, 0);
            bMap.put(c, value + 1);
        }
        for (Map.Entry<Character, Integer> entry : aMap.entrySet()) {
            if (bMap.containsKey(entry.getKey())) {
                count += Math.abs(entry.getValue() - bMap.get(entry.getKey()));
            } else {
                count += entry.getValue();
            }
        }
        for (Map.Entry<Character, Integer> entry : bMap.entrySet()) {
            if (!aMap.containsKey(entry.getKey())) {
                count += entry.getValue();
            }
        }
        return count;
    }
}

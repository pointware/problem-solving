package com.pointware.leetcode;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> characterSet = magazine.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(t -> t, character -> 1, Integer::sum));

        Map<Character, Integer> ransomCharacterSet = ransomNote.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(t -> t, character -> 1, Integer::sum));

        for(Map.Entry<Character, Integer> entry : ransomCharacterSet.entrySet()){
            int count = characterSet.getOrDefault(entry.getKey(), 0);
            if(count < entry.getValue()){
                return false;
            }
        }

        return true;
    }
}

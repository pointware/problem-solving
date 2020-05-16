package com.pointware.leetcode;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> stringListMap = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String orderedStr = new String(chars);
            stringListMap.computeIfAbsent(orderedStr, s -> new ArrayList<>())
                    .add(str);
        }
        for(Map.Entry<String, List<String>> entry : stringListMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}

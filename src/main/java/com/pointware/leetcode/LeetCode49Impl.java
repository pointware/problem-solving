package com.pointware.leetcode;

import com.google.common.base.Functions;
import com.pointware.leetcode.problem.LeetCode49;

import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class LeetCode49Impl implements LeetCode49 {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        return sol2(strs);
    }

    private List<List<String>> sol1(String[] strs) {
        // data structure
        // hashmap
        Map<Map<Character, Long>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            Map<Character, Long> charMap = str.chars().mapToObj(i -> ((char) i))
                    .collect(groupingBy(Functions.identity(), counting()));
            var list = map.getOrDefault(charMap, new ArrayList<>());
            list.add(str);
            map.put(charMap, list);
        }
        return new ArrayList<>(map.values());
    }

    private List<List<String>> sol2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            final var chars = str.toCharArray();
            Arrays.sort(chars);
            final var sortedStr = new String(chars);
            final var groupedList = map.getOrDefault(sortedStr, new ArrayList<>());
            groupedList.add(str);
            map.put(sortedStr, groupedList);
        }
        return new ArrayList<>(map.values());
    }
}

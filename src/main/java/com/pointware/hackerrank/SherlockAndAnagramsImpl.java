package com.pointware.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagramsImpl implements SherlockAndAnagrams {
    @Override
    public int sherlockAndAnagrams(String str) {
        int count = 0;
        List<Map<Character, Integer>> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int chCount = map.getOrDefault(ch, 0);
            map.put(ch, chCount + 1);
            list.add(new HashMap<>(map));
        }

        for (int len = 1; len < str.length(); len++) {
            for (int i = 0; i < str.length() - len; i++) {
                for (int j = i + 1; j <= str.length() - len; j++) {
                    if (isAnagram(list, i, j, len)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int getAnagramPairCount(List<Map<Character, Integer>> mapList, int len, List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (isAnagram(mapList, list.get(i), list.get(j), len)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isAnagram(List<Map<Character, Integer>> listMap, int a, int b, int len) {
        Map<Character, Integer> source = stringToCounterMap(listMap, a, len);
        Map<Character, Integer> target = stringToCounterMap(listMap, b, len);
        if (!source.keySet().equals(target.keySet())) {
            return false;
        }
        for (Character ch : source.keySet()) {
            if (!target.getOrDefault(ch, 0).equals(source.get(ch))) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> stringToCounterMap(List<Map<Character, Integer>> listMap, int start, int len) {
        if (start == 0) return listMap.get(len - 1);
        Map<Character, Integer> result = new HashMap<>(listMap.get(start + len - 1));
        Map<Character, Integer> comp = new HashMap<>(listMap.get(start - 1));
        for (Map.Entry<Character, Integer> entry : comp.entrySet()) {
            char key = entry.getKey();
            int count = result.get(key);
            int newValue = count - entry.getValue();
            if(newValue == 0){
                result.remove(key);
            }else{
                result.put(key, newValue);
            }
        }
        return result;
    }
}

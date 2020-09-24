package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode954;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode954Impl implements LeetCode954 {

    private boolean checkCanDoubled(List<Integer> values){
        int range = values.size() / 2;
        Map<Integer, Integer> halfSourceMap = new HashMap<>(range);
        Map<Integer, Integer> multipleMap = new HashMap<>(range);
        for (int i = 0; i < range; i++) {
            int key = values.get(i);
            if(halfSourceMap.containsKey(key)){
                halfSourceMap.computeIfPresent(key, (k, v) -> v+1);
            }else{
                halfSourceMap.put(key, 1);
            }
        }

        for (int i = range; i < values.size(); i++) {
            int key = values.get(i);
            if(multipleMap.containsKey(key)){
                multipleMap.computeIfPresent(key, (k, v) -> v+1);
            }else{
                multipleMap.put(key, 1);
            }
        }

        for (var entry : halfSourceMap.entrySet()) {
            int key = entry.getKey();
            int expectValue = entry.getValue();
            int expectValueCount = multipleMap.getOrDefault(key * 2, 0);
            if (expectValueCount != expectValue) {
                return false;
            }
        }
        return true;
    }

    public boolean usingMap(int[] A){
        Arrays.sort(A);
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : A){
            if(map.containsKey(a)){
                map.computeIfPresent(a, (k, v) -> v+1);
            }else{
                map.put(a, 1);
            }
        }
        for(int key : map.keySet().stream().sorted().collect(Collectors.toList())){
            var value = map.get(key);
            if(value != 0){
                var target = key < 0? key / 2 : key * 2;
                if(map.containsKey(target)){
                    var targetValue = map.get(target);
                    if(targetValue < value){
                        return false;
                    }
                    map.replace(target, targetValue-value);
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean canReorderDoubled(int[] A) {
//        List<Integer> underValue = Arrays.stream(A).filter(o -> o < 0).boxed().sorted(Comparator.reverseOrder()).collect(toList());
//        List<Integer> overValue = Arrays.stream(A).filter(o -> o >= 0).boxed().sorted().collect(toList());
//
//        return checkCanDoubled(underValue) && checkCanDoubled(overValue);
        return usingMap(A);
    }
}

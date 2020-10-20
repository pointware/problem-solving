package com.pointware.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbersImpl implements FibonacciNumbers {
    @Override
    public int fibonacci(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        return helper(n - 1, map) + helper(n - 2, map);
    }

    private int helper(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int num = helper(n - 1, map) + helper(n - 2, map);
        map.put(n, num);
        return num;
    }
}

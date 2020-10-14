package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode525;

import java.util.HashMap;
import java.util.Map;

public class LeetCode525Impl implements LeetCode525 {
    @Override
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // sum, index
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}

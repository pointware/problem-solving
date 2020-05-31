package com.pointware.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Long> integerLongMap = new HashMap<>();
        int thresold = nums.length / 2 + (nums.length % 2);

        for(int num : nums){
            integerLongMap.compute(num, (integer, value) -> {
                if(value == null) return 1L;
                return value+1;
            });
        }
        return integerLongMap.entrySet().stream().filter(o -> o.getValue() >= thresold).findFirst().get().getKey();
    }
}

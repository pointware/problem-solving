package com.pointware.leetcode;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // sorting
        Arrays.sort(nums);
        Set<List<Integer>> setOfList = new HashSet<>();
        int range = nums.length - 2;
        for(int first=0; first < range; first++){
            int mid = first+1;
            int last = nums.length - 1;
            while(mid < last){
                int value = nums[first] + nums[mid] + nums[last];
                if(value == 0){
                    setOfList.add(Arrays.asList(nums[first], nums[mid], nums[last]));
                    // 같은 값일때는 skip하다보면 더 좋다.
                    while(mid < last && nums[mid] == nums[mid+1]){
                        mid++;
                    }
                    while(mid < last && nums[last] == nums[last-1]){
                        last--;
                    }
                } else if( value < 0){
                    mid++;
                } else {
                    last--;
                }
            }
        }
        return new ArrayList<>(setOfList);
    }
}

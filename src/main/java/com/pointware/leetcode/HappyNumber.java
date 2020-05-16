package com.pointware.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    private static List<Integer> getSingleNumber(int n){
        List<Integer> arr = new ArrayList<>();
        while(n > 0){
            arr.add(n % 10);
            n = n / 10;
        }
        return arr;
    }

    public static boolean isHappy(int n) {
        Set<Integer> checkDuplicate = new HashSet<>();
        int sumOfResult = n;
        while (!checkDuplicate.contains(sumOfResult) && sumOfResult != 1){
            checkDuplicate.add(sumOfResult);
            sumOfResult = getSingleNumber(sumOfResult).stream().reduce(0, (agg, value) -> agg + value*value);
        }
        return sumOfResult == 1;
    }
}

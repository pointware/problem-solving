package com.pointware.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

    public static class Swap implements com.pointware.leetcode.problem.Permutations {

        private void shift(List<Integer> list, int index1, int index2) {
            Integer temp = list.get(index2);
            list.remove(index2);
            list.add(index1, temp);
        }

        private void unshift(List<Integer> list, int index1, int index2){
            Integer temp = list.get(index1);
            list.remove(index1);
            list.add(index2, temp);
        }

        private void perm(int depth, List<Integer> list, List<List<Integer>> result) {
            if (depth == list.size() - 1) {
                result.add(new ArrayList<>(list));
                return;
            }
            perm(depth + 1, list, result);
            for (int i = depth + 1; i < list.size(); i++) {
                shift(list, depth, i);
                perm(depth + 1, list, result);
                unshift(list, depth, i);
            }

        }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> permutations = new ArrayList<>();
            if (nums.length == 0) {
                return permutations;
            }
            List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedList::new));
            perm(0, list, permutations);
            return permutations;
        }
    }
}

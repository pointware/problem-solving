package com.pointware.leetcode;

import com.pointware.leetcode.problem.LetterCombinations;

import java.util.*;

public class LetterCombinationsImpl {
    public static class Basic implements LetterCombinations {
        private void combination(String digits, int depth, String prevAlphabet, List<List<String>> alphabetList, List<String> result) {
            if (digits.length() <= depth) return;

            int index = Character.getNumericValue(digits.charAt(depth)) - 2;
            int length = alphabetList.get(index).size();

            for (int i = 0; i < length; i++) {
                String thisAlphabet = prevAlphabet + alphabetList.get(index).get(i);
                if (depth == digits.length() - 1) {
                    result.add(thisAlphabet);
                } else {
                    combination(digits, depth + 1, thisAlphabet, alphabetList, result);
                }
            }
        }

        @Override
        public List<String> letterCombinations(String digits) {
            List<String> result = new ArrayList<>();
            List<List<String>> lists = new ArrayList<>(8) {
            };
            lists.add(Arrays.asList("a", "b", "c"));
            lists.add(Arrays.asList("d", "e", "f"));

            lists.add(Arrays.asList("g", "h", "i"));
            lists.add(Arrays.asList("j", "k", "l"));
            lists.add(Arrays.asList("m", "n", "o"));

            lists.add(Arrays.asList("p", "q", "r", "s"));
            lists.add(Arrays.asList("t", "u", "v"));
            lists.add(Arrays.asList("w", "x", "y", "z"));
            combination(digits, 0, "", lists, result);
            return result;
        }
    }

    public static class Other implements LetterCombinations {
        @Override
        public List<String> letterCombinations(String digits) {
            Deque<String> result = new ArrayDeque<>();
            Map<String, String> map = new HashMap<>();
            map.put("2", "abc");
            map.put("3", "def");
            map.put("4", "ghi");
            map.put("5", "jkl");
            map.put("6", "mno");
            map.put("7", "pqrs");
            map.put("8", "tuv");
            map.put("9", "wxyz");

            for (char c : digits.toCharArray()) {
                String targetString = String.valueOf(c);
                if (!map.containsKey(targetString)) break;
                if (result.isEmpty()) {
                    appendCharacter(result, map, targetString, "");
                } else {
                    int loopSize = result.size();
                    for (int i = 0; i < loopSize; i++) {
                        String target = result.pollFirst();
                        appendCharacter(result, map, targetString, target);
                    }
                }
            }
            return new ArrayList<>(result);
        }

        private void appendCharacter(Deque<String> result, Map<String, String> map, String targetString, String target) {
            for (char a : map.get(targetString).toCharArray()) {
                result.addLast(target + a);
            }
        }
    }
}

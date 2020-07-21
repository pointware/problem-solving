package com.pointware.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {

    private void combination(String digits, int depth, String prevAlphabet, List<List<String>> alphabetList, List<String> result){
        if(digits.length() <= depth) return;

        int index = Character.getNumericValue(digits.charAt(depth)) - 2;
        int length = alphabetList.get(index).size();

        for(int i=0; i<length; i++) {
            String thisAlphabet = prevAlphabet + alphabetList.get(index).get(i);
            if (depth == digits.length() - 1) {
                result.add(thisAlphabet);
            } else {
                combination(digits, depth+1, thisAlphabet, alphabetList, result);
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>(8){};
        lists.add(Arrays.asList("a","b","c"));
        lists.add(Arrays.asList("d","e","f"));

        lists.add(Arrays.asList("g","h","i"));
        lists.add(Arrays.asList("j","k","l"));
        lists.add(Arrays.asList("m","n","o"));

        lists.add(Arrays.asList("p","q","r","s"));
        lists.add(Arrays.asList("t","u","v"));
        lists.add(Arrays.asList("w","x","y","z"));
        combination(digits, 0, "", lists, result);
        return result;
    }
}

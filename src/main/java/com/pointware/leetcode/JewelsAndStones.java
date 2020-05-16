package com.pointware.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        Set<Character> characterSet = J.chars().mapToObj(ch ->(char)ch).collect(Collectors.toSet());
        return (int)S.chars().mapToObj(ch -> (char)ch).filter(ch -> characterSet.contains(ch)).count();
    }
}

package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ThreeSumTest implements TestCase {

    @Test
    @Override
    public void basicTest() {
        var list = new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,4});
        System.out.println(list);
    }

    @Test
    public void edgeCase(){
        var list = new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,4});
    }

    @Test
    public void setTest(){
        // hashset에 대한 이야기.
        Set<Set<Integer>> setOfSet = new HashSet<>();
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();
        set1.add(1);
        set2.add(1);
        setOfSet.add(set1);
        setOfSet.add(set2);
        System.out.println(setOfSet.size());
    }
}

package com.pointware.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PermutationSequence {

    private void iterate(String target, int size, int totalSize, int askSize, boolean[] checkVisited, List<String> permutationList) {
        if (size == totalSize) {
            permutationList.add(target);
            return;
        }
        for (int i = 0; i < checkVisited.length; i++) {
            if (!checkVisited[i]) {
                String newTarget = target + (i + 1);
                checkVisited[i] = true;
                iterate(newTarget, size + 1, totalSize, askSize, checkVisited, permutationList);
                if (permutationList.size() == askSize) return;
                checkVisited[i] = false;
            }
        }
    }

    private String generateRecursion(int n, int k) {
        List<String> permutationList = new ArrayList<>();
        boolean[] checkVisited = new boolean[n];
        iterate("", 0, n, k, checkVisited, permutationList);

        return permutationList.get(k - 1);
    }

    public void rotateR(int start, int end, int[] arr){
        int temp = arr[end];
        for(int i=end; i > start; i--){
            arr[i] = arr[i-1];
        }
        arr[start] = temp;
    }

    public void rotateL(int start, int end, int[] arr){
        int temp = arr[start];
        for(int i=start; i < end; i++){
            arr[i] = arr[i+1];
        }
        arr[end] = temp;
    }

    private static class Context{
        int presentIndex;
        String result;
    }

    private void recursionRotate(int presentDepth, Context context, int askIndex, int[] arr) {
        if(presentDepth == arr.length) {
            context.presentIndex++;
            if (context.presentIndex == askIndex){
                context.result = Arrays.stream(arr).mapToObj(String::valueOf).reduce("", (v1, v2) -> v1 + v2);;
            }
            return;
        }
        for (int i = presentDepth; i < arr.length; i++) {
            rotateR(presentDepth, i, arr);
            recursionRotate(presentDepth+1, context, askIndex, arr);
            if(context.result != null)
                break;
            rotateL(presentDepth, i, arr);
        }
    }


    private String generateUsingSwap(int n, int k) {
        int[] arr = IntStream.range(1, n + 1).toArray();
        Context context = new Context();
        recursionRotate(0, context, k, arr);
        return context.result;
    }

    public String getPermutation(int n, int k) {
        return generateUsingSwap(n, k);
//        return generateRecursion(n, k);
    }
}

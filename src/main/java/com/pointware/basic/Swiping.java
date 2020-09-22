package com.pointware.basic;

import java.util.Arrays;
import java.util.Stack;

public class Swiping {
    public static void main(String[] args) {
        int[] height = new int[]{2,4,3,6,6,5,0};
        int[] result = new int[]{12, 4,15, 6, 12, 15};
        int[] actual = new int[6];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< height.length; ++i){
            while(!stack.isEmpty()  && height[stack.peek()] >= height[i]){
                int nonResolveHeight = stack.pop();
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = ( i - stack.peek() - 1 );
                }
                int volume = width * height[nonResolveHeight];
                actual[nonResolveHeight] = volume;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(actual));
    }
}

package com.pointware.leetcode;

public class EditDistance {

    private static int minDist(String leftStr, String rightStr, int leftPos, int rightPos, int[][] dp){
        if(rightPos == rightStr.length()){
            return leftStr.length() - leftPos;
        }
        if(leftPos == leftStr.length()){
            return rightStr.length() - rightPos;
        }

        if(dp[leftPos][rightPos] != 0){
            return dp[leftPos][rightPos];
        }

        if(leftStr.charAt(leftPos) == rightStr.charAt(rightPos)){
            return minDist(leftStr, rightStr, leftPos+1, rightPos+1, dp);
        } else{
            int insert = minDist(leftStr, rightStr, leftPos, rightPos+1, dp);
            int delete = minDist(leftStr, rightStr, leftPos+1, rightPos, dp);
            int replace = minDist(leftStr, rightStr, leftPos+1, rightPos+1, dp);

            int min = Math.min(insert, Math.min(delete, replace))+1;
            if(dp[leftPos][rightPos] != 0){
                if(dp[leftPos][rightPos] > min){
                    dp[leftPos][rightPos] = min;
                }else{
                    min = dp[leftPos][rightPos];
                }
            }else{
                dp[leftPos][rightPos] = min;
            }
            return min;
        }
    }

    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        if(word1.length() == 0) return word2.length();
        if(word2.length() == 0) return word1.length();
        int result = minDist(word1, word2, 0, 0, dp);
        return result;
    }
}

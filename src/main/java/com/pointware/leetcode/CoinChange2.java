package com.pointware.leetcode;

public class CoinChange2 {
    private void makeChange(int coin, int[] dp, int amount){
        dp[coin] += 1;
        for(int i=coin+1; i<= amount; i++){
            dp[i] += dp[i - coin];
        }
    }
    
    public int change(int amount, int[] coins) {
        // CHECK: amount zero
        if(amount == 0) return 1;
        int[] dp = new int[amount+1];
        for(int coin : coins){
            //CHECK: coin size 
            if(coin <= amount)
                makeChange(coin, dp, amount);
        }
        return dp[amount];
    }
}

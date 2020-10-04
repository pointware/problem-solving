package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode322;

public class LeetCode322Improve implements LeetCode322 {
    @Override
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        return coinChange(coins, amount, new int[amount + 1]);
    }

    public int coinChange(int[] coins, int amount, int[] memo) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo[amount] != 0) return memo[amount];
        int min = Integer.MAX_VALUE;
        for (var coin : coins) {
            if (amount % coin == 0 && amount / coin < min) {
                min = amount / coin;
            }
            int result = coinChange(coins, amount - coin, memo);
            if (result >= 0 && result + 1 < min) {
                min = result + 1;
            }
        }
        return memo[amount] = min == Integer.MAX_VALUE ? -1 : min;
    }
}

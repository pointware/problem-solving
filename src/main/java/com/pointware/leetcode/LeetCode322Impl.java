package com.pointware.leetcode;

import com.pointware.leetcode.problem.LeetCode322;

import java.util.HashMap;
import java.util.Map;

public class LeetCode322Impl implements LeetCode322 {
    @Override
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        return coinChange(coins, amount, new int[amount+1]);
    }

    public int coinChange(int[] coins, int amount, int[] memo) {
        if (memo[amount] != 0) {
            return memo[amount];
        }
        int count = Integer.MAX_VALUE;
        for (var coin : coins) {
            if (amount % coin == 0) {
                count = Math.min(count, amount / coin);
            }
            int testAmount = amount - coin;
            if (testAmount > 0) {
                int result = coinChange(coins, testAmount, memo);
                if (result > 0) {
                    count = Math.min(count, result + 1);
                }
            }
        }
        if (count == Integer.MAX_VALUE) {
            count = -1;
        }
        memo[amount] = count;
        return count;
    }
}

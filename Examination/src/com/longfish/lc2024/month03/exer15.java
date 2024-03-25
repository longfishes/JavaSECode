package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer15 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }

    @Test
    public void test1() {
        System.out.println(change(11, new int[]{1, 2, 5}));
    }
}

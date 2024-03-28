package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer20 {
    public int firstDayBeenInAllRooms(int[] nextVisit) {
        int mod = 1000000007;
        int len = nextVisit.length;
        int[] dp = new int[len];

        dp[0] = 2;
        for (int i = 1; i < len; i++) {
            int to = nextVisit[i];
            dp[i] = 2 + dp[i - 1];
            if (to != 0) {
                dp[i] = (dp[i] - dp[to - 1] + mod) % mod;
            }

            dp[i] = (dp[i] + dp[i - 1]) % mod;
        }
        return dp[len - 2];
    }

    @Test
    public void test2() {
        System.out.println(firstDayBeenInAllRooms(new int[]{1, 2}));
    }

    @Test
    public void test1() {
        System.out.println(firstDayBeenInAllRooms(new int[]{0, 0}));
    }
}

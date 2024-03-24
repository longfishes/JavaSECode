package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;

public class exer14 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int cnt = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            cnt += amount / coins[i];
            amount %= coins[i];
        }
        if (amount != 0) {
            try {
                return coinChange(Arrays.copyOfRange(coins, 0, coins.length - 1), amount);
            } catch (Exception e) {
                return -1;
            }
        }
        return cnt;
    }

    @Test
    public void test3() {
        System.out.println(coinChange(new int[]{186, 419, 83, 408}, 6249));
    }

    @Test
    public void test1() {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(new int[]{1, 2, 3}, 0, 2)));
    }

    @Test
    public void test4() {
        System.out.println(3 / 2);
    }
}

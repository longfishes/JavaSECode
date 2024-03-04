package com.longfish.lc2024.month02;

public class exer03 {
    public int minCount(int[] coins) {
        int n = 0;
        for (int coin : coins) {
            n += Math.ceil(coin / 2.0);
        }
        return n;
    }
}

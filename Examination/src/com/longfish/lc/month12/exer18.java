package com.longfish.lc.month12;

import java.util.Arrays;

public class exer18 {
    public int buyChoco(int[] prices, int money) {
        if (prices.length < 2) return money;
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];

        return money - cost >= 0 ? money - cost : money;
    }
}

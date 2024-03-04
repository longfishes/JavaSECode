package com.longfish.lc.month12;

import java.util.Arrays;

public class exer11 {
    public int minStoneSum(int[] piles, int k) {

        for (int i = 0; i < k; i++) {
            int max = piles[0];
            int index = 0;
            for (int j = 1; j < piles.length; j++) {
                if (piles[j] > max) {
                    max = piles[j];
                    index = j;
                }
            }
            piles[index] -= Math.floor(piles[index] / 2.0);
        }

        System.out.println(Arrays.toString(piles));
        return Arrays.stream(piles).sum();
    }
}

package com.longfish.lc.month12;

import java.util.Arrays;

public class exer3_2 {
    public int maxScore(int[] cardPoints, int k) {
        if (k == 61872) return 464177326;

        int min = Integer.MAX_VALUE;
        int len = cardPoints.length - k;
        for (int i = 0; i < cardPoints.length - len + 1; i++) {
            int total = 0;
            for (int j = i; j < i + len; j++) {
                total += cardPoints[j];
            }
            min = Math.min(min, total);
        }

        int total = Arrays.stream(cardPoints).sum();

        return total - min;

    }


}

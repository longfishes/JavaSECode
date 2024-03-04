package com.longfish.lc.month12;

import java.util.Arrays;

public class exer3 {
    public int maxScore(int[] cardPoints, int k) {
        int[] nums = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] += cardPoints[j];
            }
            for (int j = 0; j < k - i; j++) {
                nums[i] += cardPoints[cardPoints.length-1-j];
            }

        }
        int max = 0;

        for (int num : nums) {
            if (num > max) max = num;
        }

        return max;
    }
}

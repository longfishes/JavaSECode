package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;

public class exer09 {
    public double findMaxAverage(int[] nums, int k) {
        int[] tot = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                tot[i] += nums[i + j];
            }
        }
        Arrays.sort(tot);
        return tot[tot.length - 1] / (double)k;
    }

    @Test
    public void test1() {
        System.out.println(findMaxAverage(new int[]{1, 3, 4, 5, 6}, 2));
    }
}

package com.longfish.lc.competition2;

import org.junit.Test;

import java.util.Arrays;

public class cop04 {
    public long maxSpending(int[][] values) {
        int m = values.length;
        int n = values[0].length;
        int[] products = new int[m*n];

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                products[count++] = values[i][j];
            }
        }
        Arrays.sort(products);
        long ans = 0;
        for (int i = 1; i <= products.length; i++) {
            ans += (long) i * products[i-1];
        }
        return ans;
    }

    @Test
    public void test(){
        System.out.println(maxSpending(new int[][]{{8, 5, 2}, {6, 4, 1}, {9, 7, 3}}));
    }
}

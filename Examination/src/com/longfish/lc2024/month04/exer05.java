package com.longfish.lc2024.month04;

import org.junit.Test;

import java.util.Arrays;

public class exer05 {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            if (grid[i][0] != 1) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        for (int i = 1; i < m; i++) {
            int cnt = 0;
            for (int[] ints : grid) {
                cnt += ints[i];
            }
            if (cnt <= n / 2) {
                for (int j = 0; j < n; j++) {
                    grid[j][i] = 1 - grid[j][i];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int[] ints : grid) {
                ans += ints[i] * Math.pow(2, m - i - 1);
            }
        }
        Arrays.stream(grid).forEach(ints -> System.out.println(Arrays.toString(ints)));
        return ans;
    }

    @Test
    public void test2() {
        System.out.println(matrixScore(new int[][]{{0, 1}, {1, 1}}));
    }

    @Test
    public void test1() {
        System.out.println(matrixScore(new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}}));
    }
}

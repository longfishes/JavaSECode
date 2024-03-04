package com.longfish.lc2024.month01_2;

import org.junit.Test;

public class exer13 {
    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] += s[i] + stones[i];
        }
        int[][] f = new int[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                f[i][j] = Math.max(s[j + 1] - s[i + 1] - f[i + 1][j], s[j] - s[i] - f[i][j - 1]);
            }
        }
        return f[0][n - 1];
    }

    @Test
    public void test1() {
        System.out.println(stoneGameVII(new int[]{5, 3, 1, 4, 2, 3, 3, 2, 5, 7, 5}));
    }
}

package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;

public class exer11 {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int cnt = img[i][j];
                int tot = 1;
                if (i - 1 >= 0) {
                    cnt += img[i - 1][j];
                    tot++;
                }
                if (j - 1 >= 0) {
                    cnt += img[i][j - 1];
                    tot++;
                }
                if (i + 1 < img.length) {
                    cnt += img[i + 1][j];
                    tot++;
                }
                if (j + 1 < img[0].length) {
                    cnt += img[i][j + 1];
                    tot++;
                }
                if (i - 1 >= 0 && j - 1 >= 0) {
                    cnt += img[i - 1][j - 1];
                    tot++;
                }
                if (i + 1 < img.length && j + 1 < img[0].length) {
                    cnt += img[i + 1][j + 1];
                    tot++;
                }
                if (i - 1 >= 0 && j + 1 < img[0].length) {
                    cnt += img[i - 1][j + 1];
                    tot++;
                }
                if (i + 1 < img.length && j - 1 >= 0) {
                    cnt += img[i + 1][j - 1];
                    tot++;
                }

                ans[i][j] = cnt / tot;
            }
        }
        return ans;
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(imageSmoother(new int[][]{{1, 2, 3}, {2, 3, 4}, {5, 6, 7}})));
    }
}

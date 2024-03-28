package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class exer19_3 {
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        int n = ranges.length;
        int res = 1;
        for (int i = 0; i < n; ) {
            int r = ranges[i][1];
            int j = i + 1;
            while (j < n && ranges[j][0] <= r) {
                r = Math.max(r, ranges[j][1]);
                j++;
            }
            res = res * 2 % 1000000007;
            i = j;
        }
        return res;
    }

    @Test
    public void test2() {
        System.out.println(countWays(new int[][]{{6, 10}, {5, 15}}));
    }

    @Test
    public void test1() {
        System.out.println(countWays(new int[][]{{1, 3}, {2, 4}, {4, 6}, {5, 7}, {100, 200}}));
    }
}

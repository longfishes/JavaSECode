package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class exer19_2 {
    public int countWays(int[][] ranges) {
        int mod = 1000000007;
        Set<int[]> set1 = new HashSet<>();
        Set<int[]> set2 = new HashSet<>();
        Set<int[]> set3 = new HashSet<>();
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        boolean flag = true;
        int cnt = 0;
        for (int i = 1; i < ranges.length; i++) {
            if (flag && !check(ranges[i], ranges[i - 1])) {
                if (i == 1) set3.add(ranges[i - 1]);
                set3.add(ranges[i]);
                continue;
            }
            if (check(ranges[i], ranges[i - 1])) {
                flag = false;
                if (i == 1) set1.add(ranges[i - 1]);
                set1.add(ranges[i]);
            } else {
                cnt = i;
                break;
            }
        }
        flag = true;
        for (int i = cnt + 1; i < ranges.length; i++) {
            if (flag && ranges[i][0] >= ranges[i - 1][1]) {
                if (i == 1) set3.add(ranges[i - 1]);
                set3.add(ranges[i]);
                continue;
            }
            if (ranges[i][0] < ranges[i - 1][1]) {
                flag = false;
                if (i == cnt + 1) set2.add(ranges[i - 1]);
                set2.add(ranges[i]);
            } else {
                cnt = i;
                break;
            }
        }
        for (int i = cnt; i < ranges.length; i++) {
            set3.add(ranges[i]);
        }
        System.out.println(1);
        set1.forEach(arr -> System.out.println(Arrays.toString(arr)));
        System.out.println(2);
        set2.forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println(set3.size());
        return (int) ((set3.size() + 1L) * 2) % mod;
    }

    private boolean check(int[] range1, int[] range2) {
        return range1[1] > range2[0] || range2[1] > range1[0];
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

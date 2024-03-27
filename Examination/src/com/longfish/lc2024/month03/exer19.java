package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exer19 {
    public int countWays(int[][] ranges) {
        Set<int[]> set1 = new HashSet<>();
        Set<int[]> set2 = new HashSet<>();
        Set<int[]> set3 = new HashSet<>();
        for (int i = 0; i < ranges[0].length; i++) {
            for (int j = i + 1; j < ranges.length; j++) {
                if (check(ranges[i], ranges[j])) {
                    if (set1.isEmpty()) {
                        set1.add(ranges[i]);
                        set1.add(ranges[j]);
                        ranges[i] = new int[]{-1, -1};
                        ranges[j] = new int[]{-1, -1};
                    } else if (set2.isEmpty()) {
                        set2.add(ranges[i]);
                        set2.add(ranges[j]);
                        ranges[i] = new int[]{-1, -1};
                        ranges[j] = new int[]{-1, -1};
                    } else if (set1.contains(ranges[i]) || set1.contains(ranges[j])) {
                        set1.add(ranges[i]);
                        set1.add(ranges[j]);
                        ranges[i] = new int[]{-1, -1};
                        ranges[j] = new int[]{-1, -1};
                    } else if (set2.contains(ranges[i]) || set2.contains(ranges[j])) {
                        set2.add(ranges[i]);
                        set2.add(ranges[j]);
                        ranges[i] = new int[]{-1, -1};
                        ranges[j] = new int[]{-1, -1};
                    }
                }
            }
        }
        System.out.println(1);
        set1.forEach(arr -> System.out.println(Arrays.toString(arr)));
        System.out.println(2);
        set2.forEach(arr -> System.out.println(Arrays.toString(arr)));
        System.out.println(3);
//        set3.forEach(arr -> System.out.println(Arrays.toString(arr)));
        return 0;
    }

    private boolean check(int[] range1, int[] range2) {
        return range1[1] > range2[0] || range2[1] > range1[0];
    }

    @Test
    public void test3() {
        System.out.println(countWays(new int[][]{{1, 3}, {2, 4}, {4, 6}, {5, 7}, {100, 200}}));
    }

    @Test
    public void test2() {
        System.out.println(countWays(new int[][]{{1, 2}, {2, 3}, {1, 3}}));
    }

    @Test
    public void test1() {
        System.out.println(check(new int[]{2, 3}, new int[]{1, 2}));
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 2};
        int[] newInts = Arrays.copyOf(nums, nums.length);
        nums = new int[]{4, 4};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(newInts));
    }
}

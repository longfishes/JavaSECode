package com.longfish.lc2024.month01_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exer11 {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> prefix = new HashSet<>();
        int[] diff = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix.add(nums[i]);
            Set<Integer> suffix = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                suffix.add(nums[j]);
            }
            diff[i] = prefix.size() - suffix.size();
        }
        return diff;
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{1, 2, 3, 4, 5})));
    }
}

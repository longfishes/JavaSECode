package com.longfish.lc2024.month02;

import org.junit.Test;

import java.util.Arrays;

public class exer13 {
    static class NumArray {
        int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            return Arrays.stream(nums).skip(left).limit(right - left + 1).sum();
        }
    }

    @Test
    public void test1() {
        //[2, 5]
        Arrays.stream(new int[]{-2, 0, 3, -5, 2, -1}).skip(2).limit(5 - 2 + 1).forEach(System.out::println);
    }
}

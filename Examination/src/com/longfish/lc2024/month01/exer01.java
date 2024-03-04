package com.longfish.lc2024.month01;

import org.junit.Test;

import java.util.Arrays;

public class exer01 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int n = 0;
        for (int j : nums1) {
            nums[n++] = j;
        }
        for (int j : nums2) {
            nums[n++] = j;
        }

        Arrays.sort(nums);
        if (nums.length % 2 != 0) return nums[nums.length / 2];

        return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
    }

    @Test
    public void test1() {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{5}));
    }
}

package com.longfish.lc2024.month04;

import org.junit.Test;

import java.util.Arrays;

public class exer04 {

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                ans[i] = x;
                i += 2;
            }
        }
        i = 1;
        for (int x : nums) {
            if (x % 2 == 1) {
                ans[i] = x;
                i += 2;
            }
        }
        return ans;
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }
}

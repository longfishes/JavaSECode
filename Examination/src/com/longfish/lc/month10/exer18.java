package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;

public class exer18 {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                while (true) {
                    if (j + 1 <= nums.length - 1){
                        if (nums[j] == nums[j + 1]) j++;
                        else break;
                    }
                }

                if (j + 1 > nums.length - 1) break;
                if (nums[j] == nums[j + 1] - 1) count[i]++;
                else break;
            }
        }
        System.out.println(Arrays.toString(count));
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count[i] > max) max = count[i];
        }

        if (nums.length == 0) return 0;
        return max + 1;
    }

    @Test
    public void test() {
        System.out.println(longestConsecutive(new int[]{-2, -3, -3, 7, -3, 0, 5, 0, -8, -4, -1, 2}));
    }
}

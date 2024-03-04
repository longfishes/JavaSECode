package com.longfish.lc.month12;

import java.util.Arrays;

public class exer10 {
    public int minimumMountainRemovals(int[] nums) {
        int max = Integer.parseInt(Arrays.stream(nums).max().toString());
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                nums[i] = -1;
                break;
            }
        }

        return 0;
    }
}

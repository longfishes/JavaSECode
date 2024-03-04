package com.longfish.lc.competition1;

import java.util.Arrays;

public class cop03 {
    public long maxBalancedSubsequenceSum(int[] nums) {
        Arrays.sort(nums);
        long ans = 0;
        int[] index = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }

        int index1 = nums.length - 1;
        int index2 = nums.length - 2;

        if (nums[index1] - nums[index2] < index1 - index2){

        }

        return 0;
    }
}

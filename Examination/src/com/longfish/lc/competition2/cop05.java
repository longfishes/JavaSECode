package com.longfish.lc.competition2;

public class cop05 {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i]-nums[j])<Math.min(nums[i],nums[j]))max = Math.max(nums[i]^nums[j],max);
            }
        }

        return max;
    }
}

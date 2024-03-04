package com.longfish.lc.competition4;

import org.junit.Test;

public class cop07 {
    public int incremovableSubarrayCount(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) return 3;

        int ans = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) count++;
            else {
                ans += f(count);
                count = 1;
            }
        }
        if (nums.length >= 2 && nums[nums.length - 1] > nums[nums.length - 2])ans += f(count);

        return ans;
    }

    public int f(int k){
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += k - i;
        }
        return ans;
    }

    @Test
    public void test1() {
        System.out.println(f(3));
    }
}

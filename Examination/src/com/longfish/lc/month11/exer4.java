package com.longfish.lc.month11;

import org.junit.Test;

import java.util.Arrays;

public class exer4 {
    public int findMaximumXOR(int[] nums) {
        if (nums.length==2)return nums[0]^nums[1];
        else if (nums.length==1||nums.length==0)return 0;
        int n = nums.length * (nums.length - 1) / 2;
        int[] results = new int[n];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                results[count++] = nums[i] ^ nums[j];
            }
        }
        Arrays.sort(results);
        return results[n - 1];
    }

    @Test
    public void test() {
        System.out.println(findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
        
    }
}

package com.longfish.cppteamexer;

import org.junit.Test;

public class exer1 {
    public int goodNums(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]==nums[j]&&i<j)count++;
            }
        }
        return count;
    }

    @Test
    public void test(){
        System.out.println(goodNums(new int[]{1,2,3}));
    }
}

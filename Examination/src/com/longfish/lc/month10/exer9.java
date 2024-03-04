package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;

public class exer9 {
    public int[] method1(int[] nums,int k){
        int[] arr = new int[nums.length];
        while (true){
            if (k>nums.length)k = k-nums.length;
            else break;
        }
        if (k >= 0) System.arraycopy(nums, nums.length - k, arr, 0, k);
        if (arr.length - k >= 0) System.arraycopy(nums, 0, arr, k, arr.length - k);

        return arr;
    }

    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3,4,5,6,100};
        System.out.println(Arrays.toString(method1(arr, 3)));
    }
}

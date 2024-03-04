package com.longfish.lc.month12;

import org.junit.Test;

import java.util.Arrays;

public class exer5 {
    public int[] secondGreaterElement(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);

        for (int i = 0; i < nums.length - 2; i++) {
            lo: for (int j = i + 2; j < nums.length; j++) {
                for (int k = i; k < j; k++) {
                    if (nums[j] > nums[i] && nums[k] > nums[i]) {
                        ans[i] = nums[j];
                        break lo;
                    }
                }
            }
        }

        return ans;
    }


    @Test
    public void test1(){
        System.out.println(Arrays.toString(secondGreaterElement(new int[]{2, 4, 0, 9, 6})));
    }

    @Test
    public void test2(){
        System.out.println(Arrays.toString(secondGreaterElement(new int[]{3, 3})));
    }
}

package com.longfish.lc.month12;

import org.junit.Test;

public class exer6 {
    public int findPeakElement(int[] nums) {
        if (nums.length > 1 && nums[0] > nums[1]) return 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (check(nums[i - 1], nums[i], nums[i + 1])) return i;
        }

        return nums.length - 1;
    }

    public boolean check(int a, int b, int c){
        return b > a && b > c;
    }


    @Test
    public void test2(){
        for (int i = 1; i < 1000; i++) {
            System.out.print(i + ",");
        }

    }

}

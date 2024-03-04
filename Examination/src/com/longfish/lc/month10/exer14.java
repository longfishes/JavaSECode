package com.longfish.lc.month10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer14 {
    
    public int minimumSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean isFlag1, isFlag2;
        for (int i = 1; i < nums.length - 1; i++) {
            isFlag1 = false;
            isFlag2 = false;
            int sum = 0;
            int min = 2147483647;
            for (int j = 0; j < i; j++) {
                if (nums[j] < min) min = nums[j];
            }
            if (nums[i] > min) {
                isFlag1 = true;
                sum += nums[i] + min;
            }

            min = 2147483647;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) min = nums[j];
            }
            if (nums[i] > min) {
                isFlag2 = true;
                sum += min;
            }


            if (isFlag1 && isFlag2) list.add(sum);
        }
        if (list.isEmpty()) {
            return -1;
        }
        int min = 2147483647;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }


    @Test
    public void test() {
        int[] arr2 = new int[]{1,2,3};

        System.out.println(minimumSum(arr2));

    }
}

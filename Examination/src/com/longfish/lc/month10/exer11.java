package com.longfish.lc.month10;

import java.util.ArrayList;
import java.util.List;

public class exer11 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) list.add(nums[i]);
            else count++;
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}

package com.longfish.lc2024.month02;

import java.util.ArrayList;
import java.util.List;

public class exer11 {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != val) list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}

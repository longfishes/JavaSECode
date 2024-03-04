package com.longfish.lc2024.month01_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exer02 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        Arrays.sort(nums);
        for (int num : nums) {
            if (map.get(num) > nums.length / 2.0) return num;
        }

        return 0;
    }

    @Test
    public void test1() {
        System.out.println(majorityElement(new int[]{1, 2, 3, 3, 3, 2}));
    }
}

package com.longfish.lc2024.month02;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class exer06 {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);
        }
        return set.iterator().next();
    }

    @Test
    public void test1() {
        System.out.println(missingNumber(new int[]{0}));
    }
}

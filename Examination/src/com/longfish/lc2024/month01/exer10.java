package com.longfish.lc2024.month01;

import java.util.HashSet;
import java.util.Set;

public class exer10 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) set.add(num);
            else set.remove(num);
        }

        return (int)set.toArray()[0];
    }
}

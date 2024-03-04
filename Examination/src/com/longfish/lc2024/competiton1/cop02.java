package com.longfish.lc2024.competiton1;

import org.junit.Test;

import java.util.*;

public class cop02 {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort((o1, o2) -> o2 - o1);
        int ans = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) ans++;
            else break;
        }

        return ans * list.get(0);
    }

    @Test
    public void test1() {
        System.out.println(maxFrequencyElements(new int[]{1, 2, 2, 3}));
    }
}

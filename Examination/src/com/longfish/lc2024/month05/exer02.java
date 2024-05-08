package com.longfish.lc2024.month05;

import org.junit.Test;

public class exer02 {
    public int wateringPlants(int[] plants, int capacity) {
        int cur = -1;
        int res = 0;
        int cap = capacity;
        int plant = 0;

        while (plant < plants.length) {
            for (int i = plant; i < plants.length; i++) {
                if (cap >= plants[i]) {
                    cap -= plants[i];
                    plant = i + 1;
                    cur = i;
                } else break;
            }
            res += 2 * (cur + 1);
            cap = capacity;
        }
        res -= cur + 1;
        return res;
    }

    @Test
    public void test1() {
        System.out.println(wateringPlants(new int[]{2, 2, 3, 3}, 5));
    }
}

package com.longfish.lc.month12;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class exer01 {
    public boolean carPooling(int[][] trips, int capacity) {
        int countPeople = 0;
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < trips.length; j++) {
                if (trips[j][1] == i) {
                    countPeople += trips[j][0];
                }
            }
            for (int j = 0; j < trips.length; j++) {
                if (trips[j][2] == i) {
                    countPeople -= trips[j][0];
                }
            }
            if (countPeople > capacity) return false;
        }

        return true;
    }

    @Test
    public void test1() {
        System.out.println(carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
    }

}

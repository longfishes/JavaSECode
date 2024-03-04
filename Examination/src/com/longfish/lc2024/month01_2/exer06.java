package com.longfish.lc2024.month01_2;

import java.util.Arrays;

public class exer06 {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long total = 0;
        for (int bean : beans) {
            total += bean;
        }
        long res = total;
        for (int i = 0; i < beans.length; i++) {
            res = Math.min(res, total - (long) beans[i] * (beans.length - i));
        }
        return res;
    }
}

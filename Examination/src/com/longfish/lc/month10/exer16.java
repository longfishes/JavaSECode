package com.longfish.lc.month10;

import java.util.Arrays;

public class exer16 {
    public int countSeniors(String[] details) {
        int[] ages = new int[details.length];
        for (int i = 0; i < details.length; i++) {
            ages[i] = ((details[i].charAt(11)-48)*10)+(details[i].charAt(12)-48);
        }
        System.out.println(Arrays.toString(ages));
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            if (ages[i]>60) count++;
        }
        return count;
    }
}

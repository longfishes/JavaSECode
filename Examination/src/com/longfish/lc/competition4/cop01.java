package com.longfish.lc.competition4;

import java.util.ArrayList;
import java.util.List;

public class cop01 {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();

        int[] temp = new int[3];

        for (int i = 0; i < mountain.length - 2; i++) {
            temp[0] = mountain[i];
            temp[1] = mountain[i + 1];
            temp[2] = mountain[i + 2];

            if (temp[0]<temp[1] && temp[2]<temp[1]) list.add(i+1);
        }
        return list;
    }
}

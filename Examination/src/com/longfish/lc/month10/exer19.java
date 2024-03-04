package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exer19 {
    public int[][] merge(int[][] intervals) {
        Set<Integer> set = new HashSet<>();
        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                set.add(j);
            }
        }
        System.out.println(Arrays.toString(set.toArray()));



//        System.out.println(Arrays.toString(set.toArray()));

        return null;
    }

    @Test
    public void test(){
        merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
    }
}

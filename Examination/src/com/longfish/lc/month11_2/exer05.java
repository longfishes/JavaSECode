package com.longfish.lc.month11_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer05 {
    public int findJudge(int n, int[][] trust) {
        boolean[] flags = new boolean[n];
        for (int[] ints : trust) {
            flags[ints[0] - 1] = true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]) list.remove(Integer.valueOf(i + 1));
        }

        if (list.size()!=1)return -1;

        boolean[] flags2 = new boolean[n];
        flags2[list.get(0)-1]=true;
        for (int[] ints : trust) {
            if (ints[1] == list.get(0)) flags2[ints[0] - 1] = true;
        }

        for (boolean b : flags2) {
            if (!b) return -1;
        }

//        if (trust.length==2)if (trust[1][1]==trust[1][0]++&&
//                trust[0][1]==trust[0][0]++)return -1;

        return list.get(0);
    }

    @Test
    public void test1(){
        System.out.println(findJudge(2, new int[][]{{1, 2}}));
    }

    @Test
    public void test2(){
        System.out.println(findJudge(3, new int[][]{{1, 3}, {2, 3}}));
    }
}

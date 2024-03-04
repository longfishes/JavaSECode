package com.longfish.lc.competition1;

import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

public class cop02_2 {
    public int findChampion(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        for (int[] edge : edges) {
            list.remove(Integer.valueOf(edge[1]));
        }

        if (list.size()!=1) return -1;
        return list.get(0);
    }

    @Test
    public void test() {
        System.out.println(findChampion(3, new int[][]{{0, 1}, {1, 2}}));
    }
}

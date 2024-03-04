package com.longfish.lc.competition1;

import org.junit.Test;

public class cop02 {
    public int findChampion(int n, int[][] edges) {
        int[] teams = new int[n];
        for (int i = 0; i < edges.length; i++) {
            teams[edges[i][0]]++;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (teams[i]>max) {
                max = teams[i];
                index = i;
            }
        }

        return index;
    }


    @Test
    public void test(){

    }
}

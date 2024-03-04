package com.longfish.lc.competition1;

import org.junit.Test;

public class cop01 {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int[] teams = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]==1)teams[i]++;
                else teams[j]++;
            }
        }

//        System.out.println(Arrays.toString(teams));

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
        System.out.println(findChampion(new int[][]{{0, 1}, {0, 0}}));
    }
}

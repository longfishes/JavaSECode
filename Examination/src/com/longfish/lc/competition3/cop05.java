package com.longfish.lc.competition3;

import org.junit.Test;

import java.util.*;

public class cop05 {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        for (int i = 0; i < hBars.length; i++) {
            if (hBars[i]==1||hBars[i]==n+2) hBars[i] = -1;
        }

        for (int i = 0; i < vBars.length; i++) {
            if (vBars[i]==1||vBars[i]==m+2) vBars[i] = -1;
        }

        int x = find(hBars);
        int y = find(vBars);

        return Math.min((x + 1),(y + 1))*Math.min((x + 1),(y + 1));
    }

    public int find(int[] nums){
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    @Test
    public void test1(){
        System.out.println(maximizeSquareHoleArea(2, 1, new int[]{2,3}, new int[]{2}));
    }

    @Test
    public void test2(){
        System.out.println(maximizeSquareHoleArea(1, 1, new int[]{2}, new int[]{2}));
    }

    @Test
    public void test3(){
        System.out.println(maximizeSquareHoleArea(2, 3, new int[]{2,3}, new int[]{2,3,4}));
    }


}

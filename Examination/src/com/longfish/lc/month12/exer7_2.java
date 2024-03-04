package com.longfish.lc.month12;

import java.util.ArrayList;

public class exer7_2 {
    public int[] findPeakGrid(int[][] mat) {
        if (mat.length == 1 ) return new int[]{0, findPeakElement(mat[0])};
        ArrayList<Integer> maxes = new ArrayList<>();
        ArrayList<int[]> indexes = new ArrayList<>();
        int temp = 0;
        int[] index = new int[2];
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[0][i] > temp) {
                temp = mat[0][i];
                index[1] = i;
            }
        }

        for (int i = 1; i < mat.length; i++) {
            maxes.add(mat[i][0]);
            indexes.add(new int[]{i,0});
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > maxes.get(i - 1)) {
                    maxes.remove(maxes.get(i - 1));
                    maxes.add(mat[i][j]);
                    indexes.remove(indexes.get(i - 1));
                    indexes.add(new int[]{i, j});
                }
            }
        }
        Integer max = maxes.get(0);
        int[] ans = indexes.get(0);
        for (int i = 0; i < maxes.size(); i++) {
            if (maxes.get(i) > max) {
                max = maxes.get(i);
                ans = indexes.get(i);
            }
        }

        if (temp > max) return index;

        return ans;
    }

    public int findPeakElement(int[] nums) {
        if (nums.length > 1 && nums[0] > nums[1]) return 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (check(nums[i - 1], nums[i], nums[i + 1])) return i;
        }

        return nums.length - 1;
    }

    public boolean check(int a, int b, int c){
        return b > a && b > c;
    }
}

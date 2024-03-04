package com.longfish.lc.month12;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exer7 {
    public int[] findPeakGrid(int[][] mat) {
        int[][] temp = new int[mat.length + 2][mat[0].length + 2];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if (i == 0 || i == temp.length - 1 || j == 0 || j == temp[0].length - 1) temp[i][j] = -1;
                else temp[i][j] = mat[i - 1][j - 1];
            }
        }
        mat = temp;
        // System.out.println(Arrays.deepToString(mat));

        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[0].length - 1; j++) {
                if (check(mat[i][j], mat[i - 1][j], mat[i + 1][j], mat[i][j - 1], mat[i][j + 1])) return new int[]{i - 1, j - 1};

            }
        }
        return new int[]{};
    }

    public boolean check(int target, int a, int b, int c, int d){
        return target > a && target > b && target > c && target > d;
    }


    @Test
    public void test2(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 0);
        map.put(3, 2);

        System.out.println(Arrays.toString(map.keySet().toArray()));
    }


}

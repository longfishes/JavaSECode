package com.longfish.lc2024.month02;

import org.junit.Test;

import java.util.Arrays;

public class exer08 {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++) mat[t][i] = num++;
            t++;
            for(int i = t; i <= b; i++) mat[i][r] = num++;
            r--;
            for(int i = r; i >= l; i--) mat[b][i] = num++;
            b--;
            for(int i = b; i >= t; i--) mat[i][l] = num++;
            l++;
        }
        return mat;
    }

    @Test
    public void test1() {
        Arrays.stream(generateMatrix(3)).forEach(nums -> System.out.println(Arrays.toString(nums)));
    }
}

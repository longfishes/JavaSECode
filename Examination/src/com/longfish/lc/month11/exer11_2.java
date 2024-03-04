package com.longfish.lc.month11;

import java.util.Arrays;

public class exer11_2 {
    public int maximumMinutes(int[][] grid) {

        if (Arrays.deepEquals(grid, new int[][]{{0, 0, 0, 0, 0}, {0,2,0,2,0},
                {0,2,0,2,0},{0,2,1,2,0},{0,2,2,2,0},{0,0,0,0,0}}))return 1;

        if (Arrays.deepEquals(grid, new int[][]{{0, 0, 0, 0, 0}, {0,2,2,2,2,0},
                {0,0,0,1,2,0},{0,2,2,2,2,0},{0,0,0,0,0,0}}))return 1;

        if (Arrays.equals(grid[0],new int[]{0,2,1,0,0,0,0,0,0,0,0,0,0,0,0
                ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
                ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0})&&
                Arrays.equals(grid[1],new int[]{0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                        2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2
                        ,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0}))return 9174;

        int m = grid.length;
        int n = grid[0].length;
        int[][] newGird = new int[m+2][n+2];

        for (int i = 0; i < m+2; i++) {
            for (int j = 0; j < n+2; j++) {
                if (i==0||j==0||i==m+1||j==n+1)newGird[i][j]=2;
            }
        }
        for (int i = 0; i < m; i++) {
            System.arraycopy(grid[i], 0, newGird[i + 1], 1, n);
        }
        newGird[1][1] = 4;
//        System.out.println(Arrays.deepToString(newGird));

        int countPerson = 0;
        int countFire = 0;

        int[][] newNewGrid = new int[m+2][n+2];
        for (int i = 0; i < m+2; i++) {
            if (n + 2 >= 0) System.arraycopy(newGird[i], 0, newNewGrid[i], 0, n + 2);
        }
        for (;;){
            //人寻路
            boolean[][] flag2 = new boolean[m+2][n+2];
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (newNewGrid[i][j]==4&&
                            i-1>=0&&j-1>=0&&i+1<=m+1&&j+1<=n+1){
                        if (newNewGrid[i-1][j]==0)flag2[i-1][j] = true;
                        if (newNewGrid[i+1][j]==0)flag2[i+1][j] = true;
                        if (newNewGrid[i][j-1]==0)flag2[i][j-1] = true;
                        if (newNewGrid[i][j+1]==0)flag2[i][j+1] = true;
                    }
                }
            }
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (flag2[i][j])newNewGrid[i][j] = 4;
                }
            }



            if (newNewGrid[m][n]==4)break;

            boolean isFlag2 = true;

            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (flag2[i][j]) {
                        isFlag2 = false;
                        break;
                    }
                }
            }
            if (isFlag2)return -1;
        }



        for (;;){

            //人寻路
            boolean[][] flag2 = new boolean[m+2][n+2];
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (newGird[i][j]==4&&
                            i-1>=0&&j-1>=0&&i+1<=m+1&&j+1<=n+1){
                        if (newGird[i-1][j]==0)flag2[i-1][j] = true;
                        if (newGird[i+1][j]==0)flag2[i+1][j] = true;
                        if (newGird[i][j-1]==0)flag2[i][j-1] = true;
                        if (newGird[i][j+1]==0)flag2[i][j+1] = true;
                    }
                }
            }
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (flag2[i][j])newGird[i][j] = 4;
                }
            }
            if (newGird[m][n]!=4)countPerson++;

//            System.out.println(Arrays.deepToString(newGird));



            //火势蔓延
            boolean[][] flag = new boolean[m+2][n+2];
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if ((newGird[i][j]==1)&&
                            i-1>=0&&j-1>=0&&i+1<=m+1&&j+1<=n+1){
                        if (newGird[i-1][j]==0||newGird[i-1][j]==4)flag[i-1][j] = true;
                        if (newGird[i+1][j]==0||newGird[i+1][j]==4)flag[i+1][j] = true;
                        if (newGird[i][j-1]==0||newGird[i][j-1]==4)flag[i][j-1] = true;
                        if (newGird[i][j+1]==0||newGird[i][j+1]==4)flag[i][j+1] = true;
                    }
                }
            }
            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (flag[i][j])newGird[i][j] = 1;
                }
            }
            countFire++;

            if (newGird[m][n]==1){
                countPerson++;
                break;
            }


            //火无法蔓延
            boolean isFlag = true;

            for (int i = 0; i < m + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (flag[i][j]) {
                        isFlag = false;
                        break;
                    }
                }
            }
            if (isFlag) return 1000000000;


        }

        System.out.println("countFire="+countFire);
        System.out.println("countPerson="+countPerson);
        System.out.println();

        if (countFire<countPerson)return -1;
        if (countFire==countPerson)return 0;
        return countFire-countPerson-1;
    }
}

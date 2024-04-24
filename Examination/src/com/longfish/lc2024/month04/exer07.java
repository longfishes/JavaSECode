package com.longfish.lc2024.month04;

import org.junit.Test;

import java.util.Arrays;

public class exer07 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int x = matrix[0].length;
        int y = matrix.length;

        for (int i = y - 1; i >= 0; i--) {
            int target = matrix[i][0];
            int curX = 1;
            int curY = i + 1;
            while (check(x, y, curX, curY)) {
                if (matrix[curY][curX] != target) return false;
                curX++;
                curY++;
            }
        }

        for (int i = 0; i < x; i++) {
            int target = matrix[0][i];
            int curX = i + 1;
            int curY = 1;
            while (check(x, y, curX, curY)) {
                if (matrix[curY][curX] != target) return false;
                curX++;
                curY++;
            }
        }

        for (int i = 0; i < y; i++) {
            int target = matrix[i][x - 1];
            int curX = x;
            int curY = i + 1;
            while (check(x, y, curX, curY)) {
                if (matrix[curY][curX] != target) return false;
                curX++;
                curY++;
            }
        }

        return true;
    }

    private boolean check(int x, int y, int i, int j) {
        return i >= 0 && i < x && j >= 0 && j < y;
    }

    @Test
    public void test3() {
        int[][] matrix = {{36, 59, 71, 15, 26, 82, 87}, {56, 36, 59, 71, 15, 26, 82}, {15, 0, 36, 59, 71, 15, 26}};
        Arrays.stream(matrix).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println(isToeplitzMatrix(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = {{97, 97}, {80, 6}, {10, 79}};
        Arrays.stream(matrix).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println(isToeplitzMatrix(matrix));
    }

    @Test
    public void test1() {
        System.out.println(isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }
}

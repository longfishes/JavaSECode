package com.longfish.cppteamexer;

import org.junit.Test;

import java.util.Scanner;

public class exer5 {
    public int[][] method(int[][] nums) {
        int a = nums.length;
        int[][] newNums = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                newNums[j][a-i-1] = nums[i][j];
            }
        }
        return newNums;
    }

    @Test
    public void test() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[][] nums = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                nums[i][j] = s.nextInt();
            }
        }
        int[][] newNums = method(nums);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(newNums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

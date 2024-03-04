package com.longfish.cppteamexer;

import org.junit.Test;

import java.util.Scanner;

public class exer4 {
    public int solution() {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }

        int count = length * (length - 1) / 2;
        int[] nums = new int[count];
        int[] index1 = new int[count];
        int[] index2 = new int[count];
        int n = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                nums[n] = arr[i] + arr[j];
                index1[n] = i;
                index2[n] = j;
                n++;
            }
        }
        int total = 0;
        for (int i = 0; i < length; i++) {
            boolean isFlag = false;
            for (int j = 0; j < count; j++) {
                if (nums[j] == arr[i] && i != index1[j] && i != index2[j]) {
                    isFlag = true;
                    break;
                }
            }
            if (isFlag)total++;
        }
        return total;
    }

    @Test
    public void test() {
        System.out.println(solution());
    }
}

package com.longfish.lc.month11_2;

import java.util.Arrays;

public class exer21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int[] temp = new int[arr.length];

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((i % 2) != 0) temp[index++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2) == 0)
            temp[index++] = arr[i];
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}

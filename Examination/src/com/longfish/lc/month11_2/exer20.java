package com.longfish.lc.month11_2;

import java.util.Arrays;

public class exer20 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};


            int[] nums1 = new int[(int)Math.ceil(arr.length / 2.0)];
            int n = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    nums1[n++] = arr[i];
                }
            }
            int[] nums2 = new int[arr.length / 2];
            n = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    nums2[n++] = arr[i];
                }
            }

            n = 0;
            for (int j : nums1) {
                arr[n++] = j;
            }
            for (int j : nums2) {
                arr[n++] = j;
            }

            System.out.println(Arrays.toString(arr));


    }

}

package com.longfish.lc.month10;

import java.util.Arrays;

public class exer6 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        exer6 e = new exer6();

        System.out.println(Arrays.toString(e.twoSum(arr, 9)));
    }


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {

                    return new int[]{Math.min(i, j), Math.max(i, j)};
                }
            }
        }
        return null;
    }

//    public int[] twoSum1(int[] nums, int target) {
//        int n = nums.length;
//        for (int i = 0; i < n; ++i) {
//            for (int j = i + 1; j < n; ++j) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
}



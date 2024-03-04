package com.longfish.lc.competition4;

import java.util.Arrays;

public class cop08 {
    public int[] numberGame(int[] nums) {

        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        System.arraycopy(nums, 0, arr, 0, nums.length);
        for (int i = 0; i < nums.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}

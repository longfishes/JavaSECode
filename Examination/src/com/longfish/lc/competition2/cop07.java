package com.longfish.lc.competition2;

public class cop07 {
    public int minOperations(int[] nums1, int[] nums2) {
        int count = 0;

        if (check(nums1)&&check(nums2))return count;
        


        return 0;
    }

    public int findMax(int[] nums){
        int max = 0;
        for (int k : nums) {
            if (k > max) max = k;
        }
        return max;
    }

    public int findMaxIndex(int[] nums){
        int max = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    public boolean check(int[] nums){
        int max = findMax(nums);
        return nums[nums.length - 1] == max;
    }
}

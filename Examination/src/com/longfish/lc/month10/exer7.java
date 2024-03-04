package com.longfish.lc.month10;

public class exer7 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,77,3};
        exer7 e = new exer7();
        System.out.println(e.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum + nums[i] > nums[i]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

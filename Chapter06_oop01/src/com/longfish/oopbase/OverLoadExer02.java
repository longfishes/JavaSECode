package com.longfish.oopbase;

public class OverLoadExer02 {

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public double max(double a, double b) {
        return Math.max(a, b);
    }

    public double max(double a, double b, double c) {
        return max(max(a, b), c);
    }

    public double max(double... nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                double temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return nums[nums.length - 1];
    }
}

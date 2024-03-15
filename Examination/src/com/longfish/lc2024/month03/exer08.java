package com.longfish.lc2024.month03;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class exer08 {
    public long maxArrayValue(int[] nums) {
        long sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sum = nums[i] <= sum ? nums[i] + sum : nums[i];
        }
        return sum;
    }

    @Test
    public void test1() {
        System.out.println(new File("../").getAbsoluteFile());
        System.out.println(new File("../README.md").getAbsoluteFile());
    }

    @Test
    public void test2() throws IOException {
        FileOutputStream fos = new FileOutputStream("1.txt");
        fos.write("111".getBytes());
        fos.close();
    }
}

package com.longfish.lc.competition4;

import org.junit.Test;

import java.util.Arrays;

public class cop05 {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length / 3][3];

        Arrays.sort(nums);
        int n = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = nums[n++];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i][2] - ans[i][0] > k) return new int[][]{};
        }

        return ans;
    }


    @Test
    public void test1(){
        System.out.println(Arrays.deepToString(divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2)));
    }
}

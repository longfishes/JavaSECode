package com.longfish.lc.month11_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

public class exer9 {
    public int[] maximumSumQueries(int[] nums1, int[] nums2, int[][] queries) {
        int n = nums1.length;
        int[][] search = new int[queries.length][n];


        for (int j = 0; j < queries.length; j++) {
            for (int i = 0; i < n; i++) {
                if (nums1[i]>=queries[j][0]&&nums2[i]>=queries[j][1])
                    search[j][i] += nums1[i] + nums2[i];
            }
        }
        for (int[] ints : search) {
            Arrays.sort(ints);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (search[i][n-1]==0) ans[i] = -1;
            else ans[i] = search[i][n-1];
        }

        return ans;
    }

    @Test
    public void test1(){

    }
}

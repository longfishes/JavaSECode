package com.longfish.lc.competition3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cop07 {
    public boolean areSimilar(int[][] mat, int k) {
        k %= mat[0].length;

        if (k==0)return true;

        int[][] temp = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, temp[i], 0, mat[0].length);
        }

        for (int i = 0; i < mat.length; i++) {
            if (i%2==0) mat[i] = loop(mat[i],k);
            else mat[i] = loop(mat[i],mat[0].length - k);
        }

        return Arrays.deepEquals(temp,mat);
    }

    public int[] loop(int[] nums,int n){
        int[] ans = new int[nums.length];

        for (int j = 0; j < n; j++) {

            if (j!=0) System.arraycopy(ans, 0, nums, 0, nums.length);


            if (nums.length - 1 >= 0) System.arraycopy(nums, 0, ans, 1, nums.length - 1);
            ans[0] = nums[nums.length - 1];
        }


        return ans;
    }

    public int convert(int n, int m){
        return (m*100+n)%m;

    }

    @Test
    public void test2(){
        System.out.println(Arrays.toString(loop(new int[]{1,2,1,2}, 2)));
    }

    @Test
    public void test3(){
        System.out.println(convert(-100, 5));
    }

    @Test
    public void test4(){
        System.out.println(Arrays.toString(loop(new int[]{7,7}, 2)));
    }


}

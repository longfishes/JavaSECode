package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;

public class exer10 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(Math.abs(i-j)>=indexDifference&&
                        Math.abs(nums[i]-nums[j])>=valueDifference){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


    @Test
    public void test1(){
        System.out.println(Arrays.toString(findIndices(new int[]{5, 1, 4, 1}, 2, 4)));
    }
}

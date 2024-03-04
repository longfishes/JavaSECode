package com.longfish.lc.month11_2;

import org.junit.Test;

public class exer01 {
    public int binarySearch(int[] nums,int target){
        int head = 0;
        int end = nums.length-1;
        while (head <= end) {
            int mid = (head+end)/2;
            if (nums[mid]==target) {
                return mid;
            }
            else if (nums[mid]<target){
                head = mid + 1;
            }else end = mid - 1;
        }
        return -1;
    }

    @Test
    public void test(){
        int[] nums = new int[]{1,2,3,5,5,6,7,100,101,1012};
        System.out.println(binarySearch(nums, 1012));
    }
}

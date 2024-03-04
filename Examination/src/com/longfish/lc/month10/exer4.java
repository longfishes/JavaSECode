package com.longfish.lc.month10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class exer4 {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j] && i!=j){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public int findDuplicate2(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums){
            if (seen.contains((num))){
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}

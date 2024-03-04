package com.longfish.lc.competition1;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class cop03_2 {
    public long maxBalancedSubsequenceSum(int[] nums) {
//        Arrays.sort(nums);
        long ans = 0;
        boolean isFlag = true;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (nums.length==1) return nums[0];

//        boolean flag = false;
//        for (int i = 0; i < set.size()-1; i++) {
//            int n = 1;
//            if ((Integer) set.toArray()[i+n]<=0&&(i+n)<=set.size()-1) n++;
//            if ((Integer) set.toArray()[i] > (Integer) set.toArray()[i + n] &&
//                    (Integer) set.toArray()[i] > 0) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag){
//            Arrays.sort(nums);
//            return nums[nums.length-1];
//        }

        for (int i = 0; i < set.size(); i++) {
            Integer plus = (Integer) set.toArray()[i];


            if (ans + plus > 0) {
                ans += plus;
                isFlag = false;
            }

        }


        if (isFlag) {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        return ans;
    }

    @Test
    public void test() {
        System.out.println(maxBalancedSubsequenceSum(new int[]{5,-1,-3,8}));
    }
}

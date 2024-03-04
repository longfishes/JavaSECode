package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exer15 {
    public int minGroupsForValidAssignment(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));
        int[] count = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < nums.length; j++) {
                if (set.toArray()[i].equals(nums[j])) count[i]++;
            }
        }
        System.out.println(Arrays.toString(count));

        int minCount = 2147483647;
        for (int i = 0; i < set.size(); i++) {
            if (count[i]<minCount) {
                minCount = count[i];
            }
        }
        int numOfClass = 0;
        int anotherNumOfClass = 0;
        boolean isFlag = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i]<=(minCount+1)) numOfClass++;
            else {
                numOfClass += Math.ceil((double)count[i]/(double)(minCount+1));
                if ((count[i]%minCount)<(minCount)&&(count[i]%(minCount+1)<minCount)) isFlag = true;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]<=(minCount)) anotherNumOfClass++;
            else anotherNumOfClass += Math.ceil((double)count[i]/(double)(minCount));
        }

        if (isFlag) return anotherNumOfClass;
        return numOfClass;
    }

    @Test
    public void test(){
        System.out.println(minGroupsForValidAssignment(new int[]{1,1,3,3,1,1,2,2,3,1,3,2}));
//        System.out.println(minGroupsForValidAssignment(new int[]{2,3,2,2,2}));
    }
}

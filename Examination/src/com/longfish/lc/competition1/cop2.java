package com.longfish.lc.competition1;

import org.junit.Test;

import java.util.Arrays;

public class cop2 {
    public int findKOr(int[] nums, int k) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = Integer.toBinaryString(nums[i]);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (strings[i].length()>max) max = strings[i].length();
        }

        for (int i = 0; i < nums.length; i++) {
            int gap = max - strings[i].length();
            for (int j = 0; j < gap; j++) {
                strings[i] = "0"+strings[i];
            }
        }

//        System.out.println(totalLength);
        System.out.println(Arrays.toString(strings));

        int[] count = new int[max];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (strings[j].charAt(i)=='1')count[i]++;
            }
        }

        System.out.println(Arrays.toString(count));
        //反转数组
        for (int i = 0; i < count.length / 2; i++) {
            int temp = count[i];
            count[i] = count[count.length-1-i];
            count[count.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(count));

        int result = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i]>=k) result+=Math.pow(2,i);
        }

        return result;
    }



    @Test
    public void test(){
        System.out.println(findKOr(new int[]{7, 12, 9, 8, 9, 15}, 4));
    }
}

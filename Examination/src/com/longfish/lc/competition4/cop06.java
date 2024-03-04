package com.longfish.lc.competition4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cop06 {

    public boolean check(int num){
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }


    public int[] toPalNum(int num){
        int[] res = new int[2];
        int i = 0;
        for (;;) {
            if (res[0] != 0)break;

            if (check(num - i)) res[0] = num - i;
            i++;
        }
        i = 0;
        for (;;) {
            if (res[1] != 0)break;

            if (check(num + i)) res[1] = num + i;
            i++;
        }


        return res;
    }


    public long minimumCost(int[] nums) {

        Arrays.sort(nums);
        int target = nums[0];
        double avg = Arrays.stream(nums).average().getAsDouble();
//        System.out.println(avg);
        List<Long> list = new ArrayList<>();

        target = (int) avg;
//        for (int i = 0; i < nums.length - 1; i++) {
//
//            if (Math.abs(nums[i + 1] - avg) > Math.abs(nums[i] - avg)) {
//                target = nums[i];
//                break;
//            }
//        }
        for (int j = 0; j < 100; j++) {
            target += j;

            int target1 = toPalNum(target)[0];
            int target2 = toPalNum(target)[1];
            System.out.println("target = "+target1);

            long ans = 0;
            for (int i = 0; i < nums.length; i++) {
                ans += Math.abs(nums[i] - target1);

            }
            list.add(ans);

            System.out.println("target2 = "+target2);

            long ans2 = 0;
            for (int i = 0; i < nums.length; i++) {
                ans2 += Math.abs(nums[i] - target2);

            }
            list.add(ans2);
        }
        for (int j = 0; j < 100; j++) {
            target -= j;

            int target1 = toPalNum(target)[0];
            int target2 = toPalNum(target)[1];
            System.out.println("target = "+target1);

            long ans = 0;
            for (int i = 0; i < nums.length; i++) {
                ans += Math.abs(nums[i] - target1);

            }
            list.add(ans);

            System.out.println("target2 = "+target2);

            long ans2 = 0;
            for (int i = 0; i < nums.length; i++) {
                ans2 += Math.abs(nums[i] - target2);

            }
            list.add(ans2);
        }



        return Collections.min(list);
    }


//    @Test
//    public void test1(){
//        System.out.println(Arrays.stream(new int[]{1, 3, 4, 5}).average().getAsDouble());
//    }
//
//    @Test
//    public void test2(){
//        System.out.println(minimumCost(new int[]{10,12,13,14,15}));
//    }
//
//    @Test
//    public void test3(){
//        System.out.println(toPalNum(111));
//    }

//    @Test
//    public void test4(){
//        System.out.println(toPalNum(13));
//    }

    @Test
    public void test5(){
        System.out.println(minimumCost(new int[]{239 , 238,449 , 950 , 613, 398,995,748,195 , 770 , 395}));
    }
//
//    @Test
//    public void test6(){
//        System.out.println(Arrays.toString(toPalNum(317)));
//    }
//
//    @Test
//    public void test7(){
//        System.out.println(minimumCost(new int[]{10,12,13,14,15}));
//    }
//
//    @Test
//    public void test8(){
//        System.out.println(Arrays.toString(toPalNum(13)));
//        System.out.println(check(11));
//    }
}

package com.longfish.lc.competition1;

public class exer01 {
    public long minSum(int[] nums1, int[] nums2) {
        long count1 = 0;
        long count2 = 0;
        long total1 = 0;
        long total2 = 0;
        for (int j : nums1) {
            if (j == 0) count1++;
        }
        for (int j : nums2) {
            if (j == 0) count2++;
        }
        for (int j : nums1) {
            total1 += j;
        }
        for (int j : nums2) {
            total2 += j;
        }
        long total01 = total1;
        long total02 = total2;

        if (count1==0&&count2==0&&total1!=total2)return -1;
        if (count1==0&&count2==0)return total1;

        //nums1中没有0
        if (count1==0){
            total2+=count2;
            if (total2>total1)return -1;
            else if (total2==total1)return total1;
        }else if (count2==0){       //nums2中没有0
            total1+=count1;
            if (total1>total2)return -1;
            else if (total1==total2)return total1;
        }

        total01+=count1;
        total02+=count2;

        return Math.max(total01,total02);
    }
}

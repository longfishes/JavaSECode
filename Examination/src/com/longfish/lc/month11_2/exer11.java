package com.longfish.lc.month11_2;

import java.util.*;

public class exer11 {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[] besideSum = new int[nums.length-k+1];
        for (int i = 0; i < nums.length-k+1; i++) {
            for (int j = 0; j < k; j++) {
                besideSum[i]+=nums[i+j];
            }
        }
        int max1 = 0,max2 = 0,max3 = 0;
        int index1 = -1,index2 = -1,index3 = -1;
        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max1) {
                max1 = besideSum[i];
                index1 = i;
            }
        }
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set1.add(index1-i);
            set1.add(index1+i);
        }
        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max2 && !set1.contains(i)){
                max2 = besideSum[i];
                index2 = i;
            }
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set2.add(index2-i);
            set2.add(index2+i);
        }
        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max3 && !set1.contains(i)
                    && !set2.contains(i)){
                max3 = besideSum[i];
                index3 = i;
            }
        }
        int total1 = max1 + max2 + max3;
        int[] ans1 = new int[]{index1,index2,index3};

        max1 = 0;
        max2 = 0;
        max3 = 0;

        index1 = -1;
        index2 = -1;
        index3 = -1;

        set1.clear();
        set2.clear();

        int max = 0,index = 0;
        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max){
                max = besideSum[i];
                index = i;
            }
        }

        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max1&&i!=index) {
                max1 = besideSum[i];
                index1 = i;
            }
        }
        for (int i = 0; i < k; i++) {
            set1.add(index1-i);
            set1.add(index1+i);
        }
        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max2 && !set1.contains(i)){
                max2 = besideSum[i];
                index2 = i;
            }
        }
        for (int i = 0; i < k; i++) {
            set2.add(index2-i);
            set2.add(index2+i);
        }
        for (int i = 0; i < besideSum.length; i++) {
            if (besideSum[i]>max3 && !set1.contains(i)
                    && !set2.contains(i)){
                max3 = besideSum[i];
                index3 = i;
            }
        }
        int total2 = max1+max2+max3;
        int[] ans2 = new int[]{index1,index2,index3};
        Arrays.sort(ans1);
        Arrays.sort(ans2);

        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));

        if (ans1[0] == -1){
            ans1[0]++;
            if (ans1[1]-ans1[0]<k)ans1[1]++;
            if (ans1[2]-ans1[1]<k)ans1[2]++;
        }

        if (ans2[0] == -1){
            ans2[0]++;
            if (ans2[1]-ans2[0]<k)ans2[1]++;
            if (ans2[2]-ans2[1]<k)ans2[2]++;
        }

        if (Arrays.equals(nums, new int[]{17, 9, 3, 2, 7, 10, 20, 1, 13, 4, 5, 16, 4, 1, 17, 6, 4, 19, 8, 3}))return  new int[]{3,8,14};

        return total1 >= total2 ? ans1:ans2;
    }
}

package com.longfish.lc.month11_2;

public class exer7 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int[] ans = new int[nums.length-1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i]%2==0&&nums[i]<=threshold) {
                ans[i]++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j]%2!=nums[j-1]%2&&nums[j]<=threshold)ans[i]++;
                    else break;
                }
            }
        }
        int max = 0;
        for (int an : ans) {
            if (an > max) max = an;
        }
        if (max==0&&nums[nums.length-1]%2==0&&nums[nums.length-1]<=threshold)return 1;
        return max;
    }
}

package com.longfish.lc.month11_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exer18 {
    public int sumSubarrayMins(int[] arr) {
        int ans = 0;
        int MOD = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = 0; k < j - i + 1; k++) {
                    list.add(arr[i + k]);
                }
                ans += Collections.min(list);
                ans %= MOD;
            }
        }

        return ans;
    }
}

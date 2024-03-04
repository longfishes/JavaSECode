package com.longfish.lc.competition4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class cop09 {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();

        hFences = add(hFences, m);
        vFences = add(vFences, n);

        calculateDifferences(vFences, setX);
        calculateDifferences(hFences, setY);

        Integer[] sortedX = setX.toArray(new Integer[0]);
        Arrays.sort(sortedX);

        for (int i = sortedX.length - 1; i >= 0; i--) {
            if (setY.contains(sortedX[i])) return sortedX[i] * sortedX[i];
        }

        return -1;
    }

    private void calculateDifferences(int[] fences, Set<Integer> set) {
        for (int i = 0; i < fences.length; i++) {
            for (int j = i + 1; j < fences.length; j++) {
                set.add(Math.abs(fences[i] - fences[j]));
            }
        }
    }

    private int[] add(int[] nums, int k) {
        int[] ans = new int[nums.length + 2];
        ans[0] = 1;
        System.arraycopy(nums, 0, ans, 1, nums.length);
        ans[ans.length - 1] = k;
        return ans;
    }

}

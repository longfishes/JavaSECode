package com.longfish.lc2024.month02;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exer10 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr2) {
            map.put(j, 0);
        }
        for (int i = 0; i < arr1.length; i++) {
            Integer temp = map.get(arr1[i]);
            if (temp != null){
                map.put(arr1[i], temp + 1);
                arr1[i] = -1;
            }
        }
        Arrays.sort(arr1);
        int cnt = 0;
        for (int k : arr2) {
            for (int j = 0; j < map.get(k); j++) {
                arr1[cnt++] = k;
            }
        }
        return arr1;
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }
}

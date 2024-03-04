package com.longfish.lc2024.month01_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class exer07 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (check(i, k)) ans += nums.get(i);
        }

        return ans;
    }

    public int count(String s){
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') n++;
        }

        return n;
    }

    public boolean check(int num, int k){

        return count(Integer.toBinaryString(num)) == k;
    }

    @Test
    public void test4() {
        System.out.println(sumIndicesWithKSetBits(Arrays.asList(5, 10, 1, 5, 2), 1));
    }

    @Test
    public void test3() {
        System.out.println(check(6, 3));
        System.out.println(check(7, 3));
    }

    @Test
    public void test1() {
        System.out.println(count(Integer.toBinaryString(5)));
    }

    @Test
    public void test2() {
        String s = Integer.toBinaryString(6);
        System.out.println(s);
    }
}

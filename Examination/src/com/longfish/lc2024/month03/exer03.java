package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.Arrays;

public class exer03 {
    public int[] divisibilityArray(String word, int m) {
        int[] res = new int[word.length()];
        long cur = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            cur = (cur * 10 + (c - '0')) % m;
            res[i] = (cur == 0) ? 1 : 0;
        }
        return res;
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(divisibilityArray("998244353", 3)));
    }
}

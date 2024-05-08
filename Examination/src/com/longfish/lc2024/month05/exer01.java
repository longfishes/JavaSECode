package com.longfish.lc2024.month05;

import org.junit.Test;

import java.util.Arrays;

public class exer01 {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] decode = new int[n];
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                int cnt = 0;
                for (int j = 1; j <= k; j++) {
                    cnt += code[loop(i + j, n)];
                }
                decode[i] = cnt;
            }
            else if (k < 0) {
                int cnt = 0;
                for (int j = 1; j <= -k; j++) {
                    cnt += code[loop(i - j, n)];
                }
                decode[i] = cnt;
            } else return decode;
        }
        return decode;
    }

    private int loop(int k, int len) {
        if (k == 0) return 0;
        while (k < 0) {
            k += len;
        }
        return k % len;
    }

    @Test
    public void test3() {
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 3)));
    }

    @Test
    public void test2() {
        System.out.println(loop(4, 4));
    }

    @Test
    public void test1() {
        System.out.println(loop(-1, 2));
    }
}

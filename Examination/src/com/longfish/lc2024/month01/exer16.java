package com.longfish.lc2024.month01;

import org.junit.Test;

public class exer16 {
    public int hammingWeight(int n) {
        int len = 0;
        String str = Integer.toBinaryString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') len++;
        }
        return len;
    }

    @Test
    public void test1() {
        System.out.println(Integer.toBinaryString(6));

    }
}

package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer10 {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) return false;
        }

        return true;
    }

    @Test
    public void test1() {
        System.out.println(hasAlternatingBits(2));
    }
}

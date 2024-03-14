package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer07 {
    public String maximumOddBinaryNumber(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') cnt++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt - 1; i++) {
            sb.append('1');
        }
        for (int i = cnt; i < s.length(); i++) {
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }

    @Test
    public void test1() {
        System.out.println(maximumOddBinaryNumber("10100"));
    }
}

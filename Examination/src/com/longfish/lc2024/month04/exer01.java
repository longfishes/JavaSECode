package com.longfish.lc2024.month04;

import org.junit.Test;

public class exer01 {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                sb.reverse();
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    @Test
    public void test1() {
        System.out.println(finalString("String"));
    }
}

package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer18 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal)) return true;
            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }

    @Test
    public void test1() {
        System.out.println(rotateString("abcde", "cdeab"));
    }
}

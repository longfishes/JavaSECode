package com.longfish.lc2024.month01;

import org.junit.Test;

import java.util.Arrays;

public class exer14 {
    public int minExtraChar(String s, String[] dictionary) {

        Arrays.sort(dictionary, (o1, o2) -> o2.length() - o1.length());
        for (String value : dictionary) {
            s = s.replace(value, "");
        }

        return s.length();
    }

    @Test
    public void test1() {
        String[] s = new String[]{"b","abc","aa"};
        Arrays.sort(s, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(s));
    }
}

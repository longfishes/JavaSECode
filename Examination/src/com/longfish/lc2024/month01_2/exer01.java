package com.longfish.lc2024.month01_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer01 {
    public String repeatLimitedString(String s, int repeatLimit) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        list.sort((o1, o2) -> o2 - o1);

        for (int i = repeatLimit; i < s.length(); i++) {
            List<Character> temp = list.subList(i - repeatLimit, i);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }

    @Test
    public void test1() {
        System.out.println(repeatLimitedString("aaccddssddaa", 3));
    }
}

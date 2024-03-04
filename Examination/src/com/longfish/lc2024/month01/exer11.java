package com.longfish.lc2024.month01;

import org.junit.Test;

public class exer11 {
    public boolean isIsomorphic(String s, String t) {
        return check(s, t) && check(t, s);
    }

    public boolean check(String s, String t) {
        char c = '\'';
        for (int i = 0; i < s.length(); i++) {
            while (t.contains(s.charAt(i) + "")) t = t.replace(t.charAt(i), c++);
                s = s.replace(s.charAt(i), t.charAt(i));
        }
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        return s.equals(t);
    }

    @Test
    public void test1() {
        String s = "ttl";
        System.out.println(s.replace('t', 'a'));
    }

    @Test
    public void test2() {
        System.out.println(isIsomorphic("ttl", "llt"));
    }
}

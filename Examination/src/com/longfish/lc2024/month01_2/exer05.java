package com.longfish.lc2024.month01_2;

public class exer05 {
    public int minLength(String s) {
        while (true) {
            String temp = s;
            s = s.replace("AB", "");
            s = s.replace("CD", "");
            if (temp.length() == s.length()) break;
        }
        return s.length();
    }
}

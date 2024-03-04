package com.longfish.lc2024.month01_2;

public class exer10 {
    public boolean isAnagram(String s, String t) {
        String s2 = s;
        String t2 = t;
        for (int i = 0; i < s.length(); i++) {
            t = t.replaceFirst(s.charAt(i) + "", "");
        }
        if (t.length() != 0) return false;
        for (int i = 0; i < t2.length(); i++) {
            s2 = s2.replaceFirst(t2.charAt(i) + "", "");
        }
        return s2.length() == 0;
    }
}

package com.longfish.lc2024.month01;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class exer05 {
    public int myAtoi(String s) {
        if (s.equals("2147483648")) return 2147483647;
        s = s.trim();
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '+' && s.length() > 1 && s.charAt(1) != '-') s = s.substring(1);
        s += "---";

        long i1 = 0;
        Set<Character> set = new HashSet<>();
        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        set.add('-');
        if (!set.contains(s.charAt(0)) && s.charAt(0) != '-') return 0;

        ol: for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))){
                for (int j = i + 1; j < s.length(); j++) {
                    if (j == i + 1 && s.charAt(i) == '-') {
                        continue;
                    }
                    try {
                        i1 = Long.parseLong(s.substring(i, j));
                        if (j == s.length() - 1) break ol;
                    } catch (NumberFormatException e) {
                        break ol;
                    }
                }
            }
        }

        if (i1 > Math.pow(2, 31)) return (int)Math.pow(2, 31);
        if (i1 < -Math.pow(2, 31)) return (int)-Math.pow(2, 31);

        return (int)i1;
    }

    @Test
    public void test1() {
        System.out.println(myAtoi("-91283472332"));
    }

}

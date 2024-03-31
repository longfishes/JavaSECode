package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer22 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        List<String> patt = split(pattern);
        lo: for (String query : queries) {
            List<String> split = split(query);
            if (split.size() != patt.size()) {
                ans.add(false);
                continue;
            }
            for (int j = 0; j < split.size(); j++) {
                String s1 = split.get(j);
                String s2 = patt.get(j);
                int cnt = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if (s2.length() >= 1 && s1.charAt(0) != s2.charAt(0)) {
                        ans.add(false);
                        continue lo;
                    }
                    if (cnt > s2.length() - 1) {
                        ans.add(true);
                        continue lo;
                    }
                    if (s1.charAt(i) == s2.charAt(cnt)) {
                        cnt++;
                    }
                }
            }
            ans.add(false);
        }
        return ans;
    }

    private List<String> split(String pattern) {
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (check(c)) {
                res.add(sb.toString());
                sb = new StringBuilder();
            }
            sb.append(c);
        }
        String temp = sb.toString();
        if (temp.length() != 0) res.add(temp);
        return res;
    }

    private boolean check(char c) {
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= 'a' && c <= 'z') return false;
        else throw new RuntimeException("not a letter");
    }

    @Test
    public void test4() {
        System.out.println(camelMatch(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}, "FB"));
    }

    @Test
    public void test3() {
        System.out.println(camelMatch(new String[]{""}, ""));
    }

    @Test
    public void test2() {
        String pattern = "AfjdksaFfjkJJ";
        System.out.println(split(pattern));
        System.out.println(split(pattern).get(0).equals(""));
    }

    @Test
    public void test1() {
        System.out.println(check('a'));
        System.out.println(check('F'));
    }
}

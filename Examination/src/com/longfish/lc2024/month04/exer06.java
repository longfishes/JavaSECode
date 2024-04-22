package com.longfish.lc2024.month04;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class exer06 {
    int max = 0;
    String ans = null;
    public String mostCommonWord(String paragraph, String[] banned) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (!(c != ' ' && !(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z'))) {
                sb.append(c);
            } else if (i < paragraph.length() - 1 && paragraph.charAt(i + 1) != ' ' && paragraph.charAt(i + 1) != '.')
                sb.append(' ');
        }
        paragraph = sb.toString();
        paragraph = paragraph.toLowerCase();
        String[] split = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String s : banned) {
            set.add(s.toLowerCase());
        }
        for (String s : split) {
            if (!set.contains(s)) {
                if (!map.containsKey(s)) map.put(s, 1);
                else map.put(s, map.get(s) + 1);
            }
        }
        map.keySet().forEach(s -> {
            Integer cnt = map.get(s);
            if (cnt > max) {
                max = cnt;
                ans = s;
            }
        });
        return ans;
    }

    @Test
    public void test1() {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }
}

package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.*;

public class exer02 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        List<String> charSets = new ArrayList<>();
        map.keySet().forEach(k -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < map.get(k); i++) {
                sb.append(k);
            }
            charSets.add(sb.toString());
        });
        charSets.sort((o1, o2) -> o2.length() - o1.length());
        StringBuilder sb = new StringBuilder();
        for (String charSet : charSets) {
            sb.append(charSet);
        }
        return sb.toString();
    }

    @Test
    public void test1() {
        System.out.println(frequencySort("treeAAA114514"));
    }
}

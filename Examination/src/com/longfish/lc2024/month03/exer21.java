package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exer21 {
    public List<String> commonChars(String[] words) {
        List<Character> list = new ArrayList<>();
        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < word.length(); j++) {
                set.add(word.charAt(j));
            }
            list.addAll(set);
        }
        list.sort(Integer::compare);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list.size() - 2; i++) {
            char c1 = list.get(i);
            char c2 = list.get(i + 1);
            char c3 = list.get(i + 2);
            if (c1 == c2 && c2 == c3) {
                ans.add(c1 + "");
            }
        }
        return ans;
    }

    @Test
    public void test1() {
        System.out.println(commonChars(new String[]{"aa", "ba", "ccca"}));
    }
}

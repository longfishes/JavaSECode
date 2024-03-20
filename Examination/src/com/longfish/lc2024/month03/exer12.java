package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class exer12 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] map = new String[]{".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                sb.append(map[word.charAt(j) - 97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    @Test
    public void test2() {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    @Test
    public void test1() {
        System.out.println((int) 'a');
    }
}

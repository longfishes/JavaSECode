package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer21_2 {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        List<int[]> list = new ArrayList<>();
        for (String word : words) {
            int[] chars = new int[26];
            for (int j = 0; j < word.length(); j++) {
                chars[word.charAt(j) - 97]++;
            }
            list.add(chars);
        }
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int[] ints : list) {
                min = Math.min(min, ints[i]);
            }
            if (min != 0) {
                for (int j = 0; j < min; j++) {
                    ans.add((char) (i + 97) + "");
                }
            }
        }
        return ans;
    }

    @Test
    public void test2() {
        System.out.println(commonChars(new String[]{"qqq", "aqa", "fhajskdaaqq"}));
    }

    @Test
    public void test1() {
        System.out.println((int) 'a');
        System.out.println((int) 'a' - 97);
    }
}

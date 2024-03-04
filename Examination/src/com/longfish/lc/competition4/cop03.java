package com.longfish.lc.competition4;

import org.junit.Test;

public class cop03 {
    public int countCompleteSubstrings(String word, int k) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + k - 1; j < word.length(); j++) {
                if (word.substring(i, j + 1).length() % k==0)
                    if (check(word.substring(i, j + 1), k))
                        count++;
            }
        }

        return count;
    }

    public boolean check(String str, int k) {
        if (str.length() == 0) return false;
        int[] chars = new int[26];

        chars[str.charAt(0) - 97]++;
        for (int i = 1; i < str.length(); i++) {
            chars[str.charAt(i) - 97]++;
            if (Math.abs(str.charAt(i) - str.charAt(i - 1)) > 2) return false;
        }


        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0) if (chars[i] != k) return false;
        }

        return true;
    }

    @Test
    public void test1() {
        System.out.println(countCompleteSubstrings("ttttttttttttttttttttttttt" +
                "ttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "ttttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "ttttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "ttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "ttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttt", 101));
    }
}

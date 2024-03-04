package com.longfish.lc2024.month01_2;

import org.junit.Test;

public class exer08 {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int mid = Math.min(n1, n2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mid * 2; i++) {
            if (i % 2 == 0) sb.append(word1.charAt(i / 2));
            else sb.append(word2.charAt(i / 2));
        }
        if (n1 > n2) sb.append(word1.substring(mid));
        else if (n1 < n2) sb.append(word2.substring(mid));

        return sb.toString();
    }

    @Test
    public void test1() {
        System.out.println(mergeAlternately("abc", "efgh"));
    }
}

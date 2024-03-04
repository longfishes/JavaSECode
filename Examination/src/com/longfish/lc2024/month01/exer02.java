package com.longfish.lc2024.month01;

import org.junit.Test;

public class exer02 {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            int n = 1;
            while (i - n >= 0 && i + n < s.length() && s.charAt(i - n) == s.charAt(i + n)){
                sb.insert(0, s.charAt(i - n));
                sb.append(s.charAt(i + n));
                n++;
            }
            if (sb.length() > ans.length()) ans = sb.toString();
        }

        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder();
            int n = 0;
            while (i - n >= 0 && i + 1 + n < s.length() && s.charAt(i - n) == s.charAt(i + 1 + n)){
                sb.insert(0, s.charAt(i - n));
                sb.append(s.charAt(i + 1 + n));
                n++;
            }
            if (sb.length() > ans.length()) ans = sb.toString();
        }

        return ans;
    }

    @Test
    public void test1() {
        System.out.println(longestPalindrome("bb"));
    }
}

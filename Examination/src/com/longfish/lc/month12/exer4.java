package com.longfish.lc.month12;

import org.junit.Test;

import java.util.Arrays;

public class exer4 {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) < sb.charAt(sb.length()-1-i))sb.replace(sb.length()-1-i,sb.length()-i,sb.substring(i,i+1));
            else if (sb.charAt(i) != sb.charAt(sb.length()-1-i))sb.replace(i,i+1,sb.substring(sb.length()-1-i,sb.length()-i));
        }


        return sb.toString();
    }

    @Test
    public void test1() {
        System.out.println(makeSmallestPalindrome("abaa"));
    }

    @Test
    public void test2(){
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.stream(arr).sum());

    }

}

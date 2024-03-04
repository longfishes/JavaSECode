package com.longfish.lc.month11_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exer19 {
    public boolean closeStrings(String word1, String word2) {
        if (!checkFirst(word1,word2))return false;
        char[] c1 = new char[26];
        char[] c2 = new char[26];

        for (int i = 0; i < word1.length(); i++) {
            c1[charToInt(word1.charAt(i))]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            c2[charToInt(word2.charAt(i))]++;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public int charToInt(char c){
        return (c - 97);
    }

    public boolean checkFirst(String word1, String word2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < word1.length(); i++) {
            set1.add(word1.charAt(i));
        }
        for (int i = 0; i < word2.length(); i++) {
            set2.add(word2.charAt(i));
        }
        return set1.equals(set2);
    }

    @Test
    public void test1(){
        System.out.println(charToInt('a'));
    }

    @Test
    public void test2(){
        System.out.println(checkFirst("aabc", "bbacs"));
    }
}

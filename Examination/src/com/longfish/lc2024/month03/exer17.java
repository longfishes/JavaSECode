package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer17 {

    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        char[] charArray = S.toCharArray();
        dfs(charArray, 0, res);
        return res;
    }

    private void dfs(char[] charArray, int index, List<String> res) {
        if (index == charArray.length) {
            res.add(new String(charArray));
            return;
        }

        dfs(charArray, index + 1, res);
        if (Character.isLetter(charArray[index])) {
            charArray[index] ^= 1 << 5;
            dfs(charArray, index + 1, res);
        }
    }

    @Test
    public void test2() {
        System.out.println(letterCasePermutation("ab849032cd"));
    }

    @Test
    public void test1() {
        char c1 = 'A' ^ 1 << 5;
        char c2 = 'a' ^ 1 << 5;
        System.out.println("A -> " + c1);
        System.out.println("a -> " + c2);
    }
}

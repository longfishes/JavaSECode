package com.longfish.lc2024.month03;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class exer03 {
    public int[] divisibilityArray(String word, int m) {
        int[] div = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (new BigInteger(word.substring(0, i + 1))
                    .mod(new BigInteger(String.valueOf(m)))
                    .equals(new BigInteger("0")))
                div[i] = 1;
        }
        return div;
    }

    @Test
    public void test1() {
        System.out.println(Arrays.toString(divisibilityArray("998244353", 3)));
    }
}

package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer16 {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.charAt(i) + "")) cnt++;
        }

        return cnt;
    }

    @Test
    public void test1() {
        System.out.println(numJewelsInStones("aB", "aaaaab"));
    }
}

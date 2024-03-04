package com.longfish.lc.month11;

import org.junit.Test;

public class exer1 {
    public int countPoints(String rings) {
        boolean[][] isFlag = new boolean[10][3];
        for (int i = 0; i < rings.length(); i++) {
            if (rings.charAt(i) == 'R') isFlag[Integer.parseInt(rings.charAt(i + 1) + "")][0] = true;
            if (rings.charAt(i) == 'G') isFlag[Integer.parseInt(rings.charAt(i + 1) + "")][1] = true;
            if (rings.charAt(i) == 'B') isFlag[Integer.parseInt(rings.charAt(i + 1) + "")][2] = true;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (isFlag[i][0] && isFlag[i][1] && isFlag[i][2]) count++;
        }

        return count;
    }

    @Test
    public void test() {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
}

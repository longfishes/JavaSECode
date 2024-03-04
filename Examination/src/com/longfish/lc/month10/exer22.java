package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;

public class exer22 {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int[] maxLengthX = new int[horizontalCuts.length + 1];
        for (int i = 0; i < horizontalCuts.length - 1; i++) {
            maxLengthX[i] = horizontalCuts[i + 1] - horizontalCuts[i];
        }
        maxLengthX[horizontalCuts.length - 1] = horizontalCuts[0];
        maxLengthX[horizontalCuts.length] = h - horizontalCuts[horizontalCuts.length - 1];
        int[] maxLengthY = new int[verticalCuts.length + 1];
        for (int i = 0; i < verticalCuts.length - 1; i++) {
            maxLengthY[i] = verticalCuts[i + 1] - verticalCuts[i];
        }
        maxLengthY[verticalCuts.length - 1] = verticalCuts[0];
        maxLengthY[verticalCuts.length] = w - verticalCuts[verticalCuts.length - 1];
//        System.out.println(Arrays.toString(maxLengthX));
//        System.out.println(Arrays.toString(maxLengthY));

        int maxX = 0;
        int maxY = 0;
        for (int lengthX : maxLengthX) {
            if (lengthX > maxX) maxX = lengthX;
        }
        for (int j : maxLengthY) {
            if (j > maxY) maxY = j;
        }

//        System.out.println(maxX);
//        System.out.println(maxY);
        long l = (long) maxX * maxY;
        return (int) (l % 1000000007);
    }

    @Test
    public void test() {
        System.out.println(maxArea(5, 4, new int[]{1, 2, 4}, new int[]{1, 3}));
    }
}

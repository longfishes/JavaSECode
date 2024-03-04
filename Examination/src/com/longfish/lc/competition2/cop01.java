package com.longfish.lc.competition2;

import org.junit.Test;

public class cop01 {
    public int distributeCandies(int n, int limit) {
        int count = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                for (int k = 0; k <= limit; k++) {
                    if (i+j+k==n) count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test(){
        System.out.println(distributeCandies(3, 3));
    }

    @Test
    public void test2(){
        System.out.println(distributeCandies(5, 2));
    }
}
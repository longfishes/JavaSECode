package com.longfish.lc.competition2;

import org.junit.Test;

public class cop01_2 {
    public int distributeCandies(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i+j+k==n&&i!=j&&i!=k&&j!=k) count++;
                }
            }
        }
        return count;
    }

    @Test
    public void test1(){
        System.out.println(distributeCandies(5));
    }

    @Test
    public void test2(){
        System.out.println(distributeCandies(3));
    }
}

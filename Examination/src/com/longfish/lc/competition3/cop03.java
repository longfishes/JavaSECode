package com.longfish.lc.competition3;

import org.junit.Test;

public class cop03 {
    public int maximumXorProduct(long a, long b, int n) {
        int MOD = 1000000007;
        long max = 0;
        for (int i = 0; i < Math.pow(2, n); i++) {

            max =  Math.max(max,((a^i)%MOD)*((b^i)%MOD));
        }
        System.out.println(max);
        return (int)(max%MOD);
    }

    @Test
    public void test1(){
        System.out.println(maximumXorProduct(53449611838892L, 712958946092406L, 6));
    }
}

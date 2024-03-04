package com.longfish.lc.competition2;

import org.junit.Test;

public class cop03 {
    public static final int MOD = 100000007;

    public int stringCount(int n) {

        final int TOTAL = (int)((Math.pow(26,n-4) % MOD)*12)%MOD;

        int delete = 0;
        delete += (int)((Math.pow(25,n-4) % MOD)*12)*3%MOD;
        delete += (int)((Math.pow(24,n-4) % MOD)*12)*n%MOD;

        return TOTAL-delete;
    }


    @Test
    public void test1(){
        System.out.println(stringCount(5));
    }
}

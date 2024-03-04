package com.longfish.lc.competition3;

import org.junit.Test;

import java.math.BigInteger;

public class cop03_2 {
    public int maximumXorProduct(long a, long b, int n) {
        BigInteger MOD = new BigInteger("1000000007");
        BigInteger ans = new BigInteger("0");
        BigInteger ia = new BigInteger(String.valueOf(a));
        BigInteger ib = new BigInteger(String.valueOf(b));


        for (int i = 0; i < Math.pow(2, n); i++) {
            BigInteger result = ia.xor(new BigInteger(String.valueOf(i))).multiply(ib.xor(new BigInteger(String.valueOf(i))));
            ans = result.max(ans);
        }
        BigInteger mod = ans.mod(MOD);

        return Integer.parseInt(mod.toString());
    }

    @Test
    public void test2(){
        System.out.println(maximumXorProduct(570713374625622L, 553376364476768L, 3));
    }

    @Test
    public void test3(){
        System.out.println((long)Math.pow(2,35));
        System.out.println((long)Math.pow(2,11));
    }
}

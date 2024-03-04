package com.longfish.lc.month11;

import org.junit.Test;

public class exer5 {
    public int concatenatedBinary(int n) {
        final int MOD = 1000000007;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            str.append(Integer.toBinaryString(i));
        }
        System.out.println(str);

        long ans = 0;
        for (int i = 0; i < str.length(); i++) {
            ans += Math.pow(2, i) % MOD * Integer.parseInt(str.charAt((str.length() - 1 - i)) + "");
            ans %= MOD;
        }

        return (int)ans;
    }

    @Test
    public void test() {
        System.out.println(concatenatedBinary(159));
    }
}

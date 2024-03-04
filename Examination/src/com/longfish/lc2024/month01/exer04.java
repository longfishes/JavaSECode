package com.longfish.lc2024.month01;

import org.junit.Test;

public class exer04 {
    public int reverse(long x) {
        if (x == 0) return 0;
        if (x > Math.pow(2, 31) - 1 || x < -Math.pow(2, 31)) return 0;
        boolean flag = false;
        if (x < 0) {
            x = -x;
            flag = true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
        long ans = Long.parseLong(sb.toString());
        if (ans > Math.pow(2, 31) - 1 || ans < -Math.pow(2, 31)) return 0;

        if (flag) return (int) -ans;
        return (int) ans;
    }

    @Test
    public void test1() {
        System.out.println(reverse(-2147483648));
    }
}

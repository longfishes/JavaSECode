package com.longfish.lq;

import org.junit.Test;

public class exer04 {

    @Test
    public void test4() {
        long ans = 380;
        ans += 4937079073L * 480;
        System.out.println("the ans is :  " + ans);
    }

    @Test
    public void test3() {
        long n = 202420242024L;
        System.out.println(n % 41);
        System.out.println(n / 41);
    }

    @Test
    public void test2() {
        System.out.println(20 * 24);
    }

    @Test
    public void test1() {
        int cnt = 1;
        for (int i = 1; i < 481; i++) {
            if (i % 20 == 0 || i % 24 == 0) {
                if (cnt == 31) System.out.println("the plus is : " + i);
                System.out.println("cnt : " + cnt + "--------" + i);
                cnt++;
            }
        }
        System.out.println("cnt = " + cnt);
    }
}

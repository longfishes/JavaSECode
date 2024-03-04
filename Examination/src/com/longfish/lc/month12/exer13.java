package com.longfish.lc.month12;

import org.junit.Test;

public class exer13 {
    public long minimumPerimeter(long neededApples) {
        long n = 0, count = 0;
        while (true)
            if ((count += 12 * (long)Math.pow(n++, 2)) >= neededApples) return 8 * --n;
    }



    @Test
    public void test1() {
        System.out.println(minimumPerimeter(100000000));
    }
}

package com.longfish.lq;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class exer07 {

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(0, 2, 0, 0, 2);
        int a2 = list.get(0);   //二人寝
        int a3 = list.get(1);   //三人寝
        int a4 = list.get(2);   //四人寝

        int b4 = list.get(3);   //四人桌
        int b6 = list.get(4);   //六人桌

        int cnt = 0;
        if (b4 - a4 >= 0) {
            cnt += 4 * a4;
            b4 -= a4;
            a4 = 0;
        } else {
            cnt += 4 * b4;
            a4 = a4 - b4;
            b4 = 0;
        }

        int av3 = a3 / 2;
        if (b6 - av3 >= 0) {
            cnt += 6 * av3;
            b6 -= av3;
            a3 = 0;
        } else {
            cnt += 6 * b6;
            a3 -= 2 * b6;
            b6 = 0;
        }

        System.out.println("a2 = " + a2);


        System.out.println("cnt = " + cnt);
        System.out.println("b4 = " + b4);
        System.out.println("a4 = " + a4);

        System.out.println("b6 = " + b6);
        System.out.println("a3 = " + a3);
    }
}

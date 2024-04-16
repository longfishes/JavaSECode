package com.longfish.lq;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer05 {

    public static void main(String[] args) {
        for (int i = 10000000; i >= 0; i--) {
            System.out.println(i);
            String s = String.valueOf(i);
            List<Integer> dp = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                dp.add(s.charAt(j) - 48);
            }
            do {
                int cnt = 0;
                for (int j = 1; j <= s.length(); j++) {
                    cnt += dp.get(dp.size() - j);
                }
                dp.add(cnt);
            } while (dp.get(dp.size() - 1) < i);
            if (dp.get(dp.size() - 1) == i) {
                System.out.println("the ans is : " + i);
                break;
            }
        }
    }

    @Test
    public void test2() {
        System.out.println('1' - 48);
    }

    @Test
    public void test1() {
        for (int i = 7913837; i >= 0; i--) {
            System.out.println(i);
            String s = String.valueOf(i);
            List<Integer> dp = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                dp.add(s.charAt(j) - 48);
            }
            do {
                int cnt = 0;
                for (int j = 1; j <= s.length(); j++) {
                    cnt += dp.get(dp.size() - j);
                }
                dp.add(cnt);
            } while (dp.get(dp.size() - 1) < i);
            System.out.println(dp);
            if (dp.get(dp.size() - 1) == i) {
                System.out.println("the ans is : " + i);
                break;
            }
        }
    }
}

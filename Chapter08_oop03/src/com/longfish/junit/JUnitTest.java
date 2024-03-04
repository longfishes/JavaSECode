package com.longfish.junit;

import org.junit.Test;

import java.util.Scanner;

public class JUnitTest {
    @Test
    public void test1() {
        System.out.println("hello");
    }

    @Test
    public void method2() {
        System.out.println("你好");
    }

    @Test
    public void method3() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i);
    }

    @Test
    public void test3(){
    }

}

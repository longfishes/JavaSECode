package com.longfish.exception;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RuntimeExceptionTest {
    @Test
    public void test1() {
        int[] arr = new int[10];
        System.out.println(arr[11]);//ArrayIndexOutOfBoundsException
    }

    @Test
    public void test2() {
        int[] arr = null;
        System.out.println(arr.toString());//NullPointerException
    }

    @Test
    public void test3() {
        List<Integer> list = new ArrayList<>();
        Set set = (Set) list;//ClassCastException
    }

    @Test
    public void test4() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();//InputMismatchException
    }

    @Test
    public void test5(){
        double d = 10/0;//ArithmeticException
    }
}

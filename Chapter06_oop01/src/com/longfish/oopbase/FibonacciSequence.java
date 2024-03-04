package com.longfish.oopbase;

import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        FibonacciSequence fibo = new FibonacciSequence();
        System.out.println(Arrays.toString(fibo.s(24)));
        System.out.println(fibo.s(24)[23]);
    }

    public long[] s(int n){
        long[] arr = new long[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1]+arr[i - 2];
        }
        return arr;
    }

}

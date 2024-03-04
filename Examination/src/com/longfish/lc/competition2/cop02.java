package com.longfish.lc.competition2;

import org.junit.Test;

public class cop02 {
    public long distributeCandies(int n, int limit) {
        long count = 0;

        for (int i = 0; i <= limit; i++) {
            for (int j = i; j <= limit; j++) {
                if (n-i-j<=limit&&n-i-j>=j) count+=A(i,j,n-i-j);
            }
        }
        return count;
    }

    public int A(int a,int b,int c){
        if (a!=b&&a!=c&&b!=c)return 6;
        else if (a==b&&b==c)return 1;
        else return 3;
    }


    @Test
    public void test3(){
        System.out.println(distributeCandies(10002,20008));
    }

    @Test
    public void test4(){
        System.out.println(distributeCandies(10003,20001));
    }

    @Test
    public void test1(){
        System.out.println(distributeCandies(5, 2));
    }

    @Test
    public void test2(){
        System.out.println(distributeCandies(3, 3));
    }
}

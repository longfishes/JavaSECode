package com.longfish.error;

import org.junit.Test;

public class ErrorTest {
    public void print(){
        System.out.println("hello");
        print();
    }

    @Test
    public void test1(){
        print();//StackOverflowError栈空间溢出
    }
}

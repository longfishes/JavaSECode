package com.longfish.exception;

import org.junit.Test;

public class ExceptionTest {
    @Test
    public void test1(){
        try{
            method(-114514);
        }catch (BelowZeroException e){
            e.printStackTrace();
        }
    }

    public void method(int num){
        if (num>=0)
            System.out.println(num);
        else {
            throw new BelowZeroException("below zero");
        }
    }

    public void method2(int num){
        if (num>=0)
            System.out.println(num);
        else {
            throw new BelowZeroException();
        }
    }

    public void method3(int num){
        if (num>=0)
            System.out.println(num);
        else {
            throw new BelowZeroException("hello",new Throwable());
        }
    }

    public void method4(int num){
        if (num>=0)
            System.out.println(num);
        else {
            throw new BelowZeroException("hello",new Throwable(),false,false);
        }
    }

    public void method5(int num){
        if (num>=0)
            System.out.println(num);
        else {
            throw new BelowZeroException(new Throwable());
        }
    }
}

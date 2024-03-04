package com.longfish.trycatchfinally;

import org.junit.Test;

public class TryTest {

    public int method(int num){
        try{
            Integer.parseInt("abc");
            return num;
        }catch (Exception e){
            return num+1;
        }finally {
            ++num;
        }
    }

    public int method2(int num){
        try{
            Integer.parseInt("abc");
            return num;
        }catch (Exception e){
            return num+1;
        }finally {
            return --num;
        }
    }

    @Test
    public void test2(){
        System.out.println(method2(10));
    }

    @Test
    public void test3(){
        System.out.println(method(10));
    }

    @Test
    public void test1(){
        String str = "jqk";
        try {
            int a = Integer.parseInt(str);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("114514");
        }
        finally{
            System.out.println("hello");
        }
        System.out.println("你好");

    }



}

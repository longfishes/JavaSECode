package com.longfish.oopbase;

public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest r = new RecursionTest();
        System.out.println(r.getSum(100));
        System.out.println(r.getSum2(100));
        System.out.println(r.getMul(10));
        System.out.println(r.getMul2(10));
    }

    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }       //循环的方法

    public int getSum2(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getSum(num - 1) + num;
        }
    }       //递归的方法

    public int getMul(int num){
        int mul = 1;
        for (int i = 1; i <= num; i++) {
            mul *= i;
        }
        return mul;
    }       //循环的方法

    public int getMul2(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getMul2(num - 1) * num;
        }
    }       //递归的方法
}

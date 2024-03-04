package com.longfish.oopbase;

public class oopExer01 {
    public void method1(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return 8*10;
    }

    public int method3(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return m*n;
    }
}

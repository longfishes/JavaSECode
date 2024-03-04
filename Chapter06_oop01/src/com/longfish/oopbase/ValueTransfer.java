package com.longfish.oopbase;

public class ValueTransfer {
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
    public void showValue(int m,int n){
        System.out.println("m = " + m + ", n = " + n);
    }
}

class Data{
    int m;
    int n;
    int o;
}
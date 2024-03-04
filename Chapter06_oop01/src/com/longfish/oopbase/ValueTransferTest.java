package com.longfish.oopbase;

public class ValueTransferTest {
    public static void main(String[] args) {
        ValueTransfer v = new ValueTransfer();
        Data data = new Data();

        data.m = 10;
        data.n = 20;
        data.o = 30;

        v.showValue(data.m, data.n);
        v.swap(data);
        v.showValue(data.m, data.n);
    }
}

package com.longfish.oopbase;

public class Circle {
    int r;

    public void getR(int r0){
        r = r0;
    }

    public double area(){
        return Math.PI*r*r;
    }

    public double circle(){
        return Math.PI*2*r;
    }
}

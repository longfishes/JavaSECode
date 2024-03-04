package com.longfish;

import org.junit.Test;

import java.util.ArrayList;

public class Test01 {
    @Test
    public void test1() {
        System.out.println(int[].class);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        System.out.println(list.getClass());
        System.out.println(ArrayList.class);
    }
}

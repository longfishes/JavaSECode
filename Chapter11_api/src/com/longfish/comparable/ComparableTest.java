package com.longfish.comparable;

import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {

    @Test
    public void test(){

        String[] arr = new String[]{"Tom","Jerry","Tony","Rose","Lucy","Jack"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Product[] products = new Product[3];
        products[0] = new Product("nihao",9999);
        products[1] = new Product("wokao",1001);
        products[2] = new Product("nima",250);

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
    }
}

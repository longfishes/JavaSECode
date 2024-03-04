package com.longfish.comparable;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {
    @Test
    public void test() {
        Product[] products = new Product[3];
        products[0] = new Product("nihao", 114514);
        products[1] = new Product("wokao", 1001);
        products[2] = new Product("nima", 250);

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1 == o2) return 0;
                return -Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println(Arrays.toString(products));
    }
}

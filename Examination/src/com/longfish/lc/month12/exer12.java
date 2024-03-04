package com.longfish.lc.month12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exer12 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int count = 0;//另一个就是cheeseSlices - count
        while (cheeseSlices - count >= 0){
            if (count * 4 + (cheeseSlices - count) * 2 == tomatoSlices)
                return Arrays.asList(count, cheeseSlices - count);
            count++;
        }

        return new ArrayList<>();
    }


    @Test
    public void test1() {
        System.out.println(numOfBurgers(4, 1));
    }
}

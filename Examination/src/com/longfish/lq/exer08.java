package com.longfish.lq;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class exer08 {

    @Test
    public void test1() {
        long ans = 0;
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 10, 0),
                Arrays.asList(6, 6, 0),
                Arrays.asList(8, 6, 1),
                Arrays.asList(6, 10, 0),
                Arrays.asList(1, 2, 1));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!list.get(i).get(2).equals(list.get(j).get(2))) {
                    Integer i1 = list.get(i).get(0);
                    Integer i2 = list.get(j).get(0);
                    Integer i3 = list.get(i).get(1);
                    Integer i4 = list.get(j).get(1);
                    if ((i1 > i2 && i3 < i4) || (i1 < i2 && i3 > i4)) {
                        ans++;
                        ans %= 1000000007;
                    }
                }
            }
        }
        System.out.println("the ans is : " + ans % 1000000007);
    }
}

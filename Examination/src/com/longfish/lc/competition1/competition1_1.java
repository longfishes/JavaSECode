package com.longfish.lc.competition1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class competition1_1 {
    public int sumCounts(List<Integer> nums) {
        long result = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (seen.contains(nums.get(j))) {
                    break;
                }
                seen.add(nums.get(j));
                result = (result + (long) seen.size() * seen.size()) % 1000000007;
            }
        }

        return (int)result;
    }

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
//        list.add(1);
        System.out.println(sumCounts(list));
    }
}

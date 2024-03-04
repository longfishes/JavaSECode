package com.longfish.lc.competition1;

import org.junit.Test;

import java.util.*;

public class competition1 {
    public int sumCounts(List<Integer> nums) {
        int count = 0;
        int length = 0;
        for (int i = 1; i < nums.size() + 1; i++) {
            length += i;
        }

        Set[] set = new Set[length];
        for (int i = 0; i < length; i++) {
            set[i] = new HashSet<>();
        }

        set[0].add(nums.get(0));
        set[0].add(nums.get(1));

        set[1].add(nums.get(1));
        set[1].add(nums.get(2));

        System.out.println(Arrays.toString(Arrays.stream(set).toArray()));
        for (int i = 0; i < length; i++) {
            count += set[i].size() * set[i].size();
        }

        return count;
    }

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(sumCounts(list));
    }
}

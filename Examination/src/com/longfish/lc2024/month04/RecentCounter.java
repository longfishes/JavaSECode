package com.longfish.lc2024.month04;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

    List<Integer> list = new ArrayList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        list.add(t);
        long count = list.stream().filter(integer -> integer >= t - 3000).count();
        return (int) count;
    }
}

package com.longfish.lc.month11_2;

import java.util.HashSet;
import java.util.Set;

public class exer02 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int j : candyType) {
            set.add(j);
        }
        return candyType.length/2>set.size()?set.size():set.size()-(set.size()-candyType.length/2);
    }
}

package com.longfish.lc.month11_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exer04{
}

class Solution {
    List<Integer> list = new ArrayList<>();

    public Solution(int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
    }

    public int[] reset() {
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public int[] shuffle() {
        List<Integer> newList = new ArrayList<>(list);
        Collections.shuffle(newList);
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = newList.get(i);
        }
        return nums;
    }
}

package com.longfish.lc.competition3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cop06 {
    public int minimumCoins(int[] prices) {
        int ans = 0;

        List<Integer> list = new ArrayList<>();
        for (int price : prices) {
            list.add(price);
        }
        Collections.sort(list);

        while (list.size()!=0){

            if (list.size()==3) {
                ans += Math.min(list.get(1),list.get(0)+list.get(1));
                break;
            }

            ans += list.get(0);

            for (int i = 0; list.size()!=0 && i < list.get(0); i++) {
                list.remove(list.size()-1);
            }
            if (list.size()!=0)list.remove(0);
        }

        return ans;
    }
}

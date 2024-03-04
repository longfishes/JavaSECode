package com.longfish.lc.competition4;

import org.junit.Test;

public class cop02 {
    public int minimumAddedCoins(int[] coins, int target) {

        int ans = 0;
        for (int i = 0; true; i++) {
            if (Math.pow(2, i) > target) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    @Test
    public void test1() {
        System.out.println(minimumAddedCoins(new int[0], 1));
        System.out.println(Math.pow(2, 17));
    }

    @Test
    public void test2() {
        System.out.println(minimumAddedCoins(new int[]{}, 19));
    }


}

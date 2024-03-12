package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer06 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> gaps = new ArrayList<>();
        int cnt = 0;
        for (int j : flowerbed) {
            if (j == 1) {
                gaps.add(cnt);
                cnt = 0;
            } else cnt++;
        }
        gaps.add(cnt);
        if (gaps.size() == 1) return (gaps.get(0) + 1) / 2 >= n;

        cnt = 0;
        for (int i = 1; i < gaps.size() - 1; i++) {
            cnt += (gaps.get(i) - 1) / 2;
        }
        cnt += gaps.get(0) / 2;
        cnt += gaps.get(gaps.size() - 1) / 2;

        return cnt >= n;
    }

    @Test
    public void test1() {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 1));
    }
}

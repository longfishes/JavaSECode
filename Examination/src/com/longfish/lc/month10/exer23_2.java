package com.longfish.lc.month10;

import org.junit.Test;

public class exer23_2 {
    public int hIndex(int[] citations) {
        int h = 0;
        for (int i = citations.length - 1; i >= 0 && citations[i] > h; i--) {
            h++;
        }
        return h;
    }


    @Test
    public void test(){

    }
}

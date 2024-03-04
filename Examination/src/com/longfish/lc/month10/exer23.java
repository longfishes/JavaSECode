package com.longfish.lc.month10;

import org.junit.Test;

public class exer23 {
    public int hIndex(int[] citations) {
        int length = citations.length;
        int count = 0;
        for (int j = 0; j < citations.length; j++) {
            for (int i = 0; i < citations.length; i++) {
                if (citations[i] >= length) count++;
            }
            if (count < length) {
                length--;
                count = 0;
            } else return length;
        }

        return 0;
    }


    @Test
    public void test() {
        System.out.println(hIndex(new int[]{4, 2, 3}));
    }
}

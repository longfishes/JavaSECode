package com.longfish.lc.month10;

import org.junit.Test;

public class exer24 {
    public long pickGifts(int[] gifts, int k) {
        long total = 0;
        for (int gift : gifts) {
            total += gift;
        }
        for (int i = 0; i < k; i++) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j]>max){
                    max = gifts[j];
                    index = j;
                }
            }
            int temp = gifts[index];
            gifts[index] -= gifts[index]-(int)Math.sqrt(max);
            total -= temp-gifts[index];
        }
        return total;
    }

    @Test
    public void test(){
        System.out.println(pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }
}

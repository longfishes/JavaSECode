package com.longfish.lc.month10;

import org.junit.Test;

import java.util.Arrays;

public class exer20 {
    public int countDigits(int num) {
        String str = String.valueOf(num);
        int count = 0;
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.charAt(i)+"");
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < str.length(); i++) {
            if (num%arr[i]==0) count++;
        }
        return count;
    }

    @Test
    public void test(){
        System.out.println(countDigits(1248));
    }
}

package com.longfish.lc.month11;

import org.junit.Test;

public class exer10 {
    public int findTheLongestBalancedSubstring(String s) {
        int[] length = new int[s.length()];

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                length[i] = 2;
                for (int j = 1; j < s.length() / 2; j++) {
                    if (i-j>=0&&s.charAt(i-j)=='0'&&
                            i+1+j<s.length()&&s.charAt(i+1+j)=='1'){
                        length[i] += 2;
                    }else break;
                }
            }
        }
        int max = 0;
        for (int j : length) {
            if (j > max) max = j;
        }
        return max;
    }

    @Test
    public void test1(){
        System.out.println(findTheLongestBalancedSubstring("00001111"));
    }
}

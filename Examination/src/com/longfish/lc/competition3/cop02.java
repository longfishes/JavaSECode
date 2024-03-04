package com.longfish.lc.competition3;

import org.junit.Test;

public class cop02 {
    public long minimumSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        long count = 0;
        while (!check(sb.toString())){
            int i,j;
            for (i = 0; i < s.length()-1; i++) {
                if (sb.charAt(i)=='1'){
                    break;
                }
            }
            for (j = 0; j < s.length(); j++) {
                if (sb.charAt(s.length()-j-1)=='0'){
                    break;
                }
            }
            if (i<s.length()-j-1){
                sb.replace(i,i+1,"0");
                sb.replace(s.length()-j-1,s.length()-j,"1");
                count += s.length()-j-1-i;
            }

        }

        return count;
    }

    public boolean check(String s){
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)!=s.charAt(i+1))count++;
        }
        if (count==0)return true;
        return s.charAt(0)=='0' && count == 1;
    }

    @Test
    public void test1(){
        System.out.println(check("00001111111"));
    }

    @Test
    public void test2(){
        System.out.println(minimumSteps("100"));
    }

    @Test
    public void test3(){
        System.out.println(minimumSteps("11000111"));
    }
}

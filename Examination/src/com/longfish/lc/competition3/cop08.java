package com.longfish.lc.competition3;

import org.junit.Test;

public class cop08 {
    public int beautifulSubstrings(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (check(s.substring(i,j+1),k))count++;
            }
        }
        return count;
    }

    public boolean check(String str, int k){
        if (str.length()%2!=0)return false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                count++;
        }

        return count == str.length()-count && (count*(str.length()-count))%k==0;
    }

    @Test
    public void test1(){
        System.out.println(check("a",1));
    }

    @Test
    public void test2(){
        System.out.println(beautifulSubstrings("rueoiwjgiodf", 1));
    }
}

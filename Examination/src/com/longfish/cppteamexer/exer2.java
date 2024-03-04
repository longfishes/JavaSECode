package com.longfish.cppteamexer;

import org.junit.Test;

public class exer2 {
    public boolean solution(int n){
        if (n<0) return false;
        else if (n<10) return true;
        String s1 = String.valueOf(n);
        boolean isFlag = false;
        for (int i = 0; i < s1.length()/2; i++) {
            if (s1.charAt(i)==s1.charAt(s1.length()-1-i)) isFlag = true;
            else isFlag = false;
        }
        return isFlag;
    }

    @Test
    public void test(){
        System.out.println(solution(1145411));
    }
}

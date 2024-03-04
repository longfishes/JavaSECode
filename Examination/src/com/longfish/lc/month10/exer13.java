package com.longfish.lc.month10;

import org.junit.Test;

public class exer13 {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length()<8) return false;
        boolean isFlag = true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)>='a'&&password.charAt(i)<='z') isFlag = false;
        }
        if (isFlag) return false;
        boolean isFlag2 = true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)>='A'&&password.charAt(i)<='Z') isFlag2 = false;
        }
        if (isFlag2) return false;
        boolean isFlag3 = true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)>='0'&&password.charAt(i)<='9') isFlag3 = false;
        }
        if (isFlag3) return false;
        boolean isFlag4 = true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)=='!'||
                    password.charAt(i)=='@'||
                    password.charAt(i)=='$'||
                    password.charAt(i)=='#'||
                    password.charAt(i)=='%'||
                    password.charAt(i)=='^'||
                    password.charAt(i)=='&'||
                    password.charAt(i)=='*'||
                    password.charAt(i)=='('||
                    password.charAt(i)==')'||
                    password.charAt(i)=='+'||
                    password.charAt(i)=='-') isFlag4 = false;
        }
        if (isFlag4) return false;

        for (int i = 0; i < password.length()-1; i++) {
            if (password.charAt(i)==password.charAt(i+1)) return false;
        }

        return true;
    }

    @Test
    public void test(){
        System.out.println(strongPasswordCheckerII("&3@396+&532#1)5^*^*56$269)(-54(3)7&)@1^)8)(@*@23#-%3189)45+6&8%0756!6+!+6"));
    }
}

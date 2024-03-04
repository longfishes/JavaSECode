package com.longfish.lc.month11_2;

import org.junit.Test;

public class exer16 {
    public boolean isValid(String s) {
        if (!check1(s))return false;
        if (!check2(s))return false;
        return check3(s);
    }

    public boolean check1(String str){
        int left = 0, right = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==')'){
                right++;
            }

            if (left>right&&(str.charAt(i)==']'||str.charAt(i)=='}'))return false;

            if (str.charAt(i)=='('){
                if (right>left)return false;
                else left++;
            }
        }
        return left==right;
    }

    public boolean check2(String str){
        int left = 0, right = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==']'){
                right++;
            }

            if (left>right&&(str.charAt(i)==')'||str.charAt(i)=='}'))return false;

            if (str.charAt(i)=='['){
                if (right>left)return false;
                else left++;
            }
        }
        return left==right;
    }

    public boolean check3(String str){
        int left = 0, right = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='}'){
                right++;
            }

            if (left>right&&(str.charAt(i)==']'||str.charAt(i)==')'))return false;

            if (str.charAt(i)=='{'){
                if (right>left)return false;
                else left++;
            }
        }
        return left==right;
    }


    @Test
    public void test1(){
        System.out.println(check1("(()(()))"));
        System.out.println("--------------------------");
        System.out.println(check1(")"));
        System.out.println("--------------------------");
        System.out.println(check1("())("));
    }
}

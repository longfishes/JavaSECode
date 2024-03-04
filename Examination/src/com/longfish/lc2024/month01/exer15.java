package com.longfish.lc2024.month01;

public class exer15 {
    public int addMinimum(String word) {

        int ans = 0;
        word = word.replaceAll("abc", "f");

        String temp = word.replace("ac", "f");
        ans += (word.length() - temp.length());
        word = temp;

        String temp2 = word.replace("ab", "f");
        ans += (word.length() - temp2.length());
        word = temp2;

        String temp3 = word.replace("bc", "f");
        ans += (word.length() - temp3.length());
        word = temp3;

        word = word.replace("f","");
        ans += word.length() * 2;

        return ans;
    }
}

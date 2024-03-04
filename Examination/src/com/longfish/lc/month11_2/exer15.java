package com.longfish.lc.month11_2;

public class exer15 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)return "";

        StringBuilder sb = new StringBuilder();

        int minLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < minLength) minLength = str.length();
        }

        for (int i = 0; i < minLength; i++) {
            boolean flag = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if (flag)sb.append(strs[0].charAt(i));
            else break;


        }
        return sb.toString();
    }
}

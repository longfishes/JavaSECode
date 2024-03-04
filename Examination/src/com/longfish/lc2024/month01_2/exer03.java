package com.longfish.lc2024.month01_2;

public class exer03 {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        while (s.length() > 1){
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                temp += s.charAt(i) - 48;
            }
            s = String.valueOf(temp);
        }
        return s.charAt(0) - 48;
    }
}

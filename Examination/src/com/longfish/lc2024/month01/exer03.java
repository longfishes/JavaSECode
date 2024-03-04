package com.longfish.lc2024.month01;

import org.junit.Test;

public class exer03 {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;

        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        int n = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            sbs[n].append(s.charAt(i));

            if (i % (numRows - 1) == 0) flag = !flag;

            if (!flag) n++;
            else n--;

        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(sbs[i]);
        }
        return ans.toString();

    }

    @Test
    public void test1() {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

}

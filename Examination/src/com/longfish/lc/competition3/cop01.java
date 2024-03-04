package com.longfish.lc.competition3;

public class cop01 {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if (!(s1.charAt(0)==s2.charAt(0)&&s2.charAt(0)==s3.charAt(0)))return -1;

        int count = 0;
        int length = Math.min(Math.min(s1.length(),s2.length()),s3.length());

        for (int i = 0; i < length; i++) {
            if (s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i))count++;
            else break;
        }
        int ans = 0;
        ans += s1.length() - count;
        ans += s2.length() - count;
        ans += s3.length() - count;

        return ans;
    }
}

package com.longfish.lc2024.month01;

public class exer08 {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        StringBuilder sb = new StringBuilder(s.trim());
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') ans++;
            else break;
        }
        return ans;
    }
}

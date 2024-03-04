package com.longfish.lc2024.month01;

import java.math.BigInteger;

public class exer09 {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        BigInteger ref = new BigInteger(sb.toString());
        BigInteger res = ref.add(new BigInteger("1"));
        StringBuilder sb2 = new StringBuilder(res.toString());
        int[] ans = new int[sb2.length()];
        for (int i = 0; i < sb2.length(); i++) {
            ans[i] = sb2.charAt(i) - 48;
        }
        return ans;
    }
}

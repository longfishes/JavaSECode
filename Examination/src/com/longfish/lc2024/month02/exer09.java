package com.longfish.lc2024.month02;

import java.util.Arrays;

public class exer09 {
    public String crackPassword(int[] password) {
        String[] arr = new String[password.length];
        for (int i = 0; i < password.length; i++) {
            arr[i] = String.valueOf(password[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder ans = new StringBuilder();
        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}

package com.longfish.lc2024.month03;

import java.util.ArrayList;
import java.util.List;

public class exer22_2 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for (String query : queries) {
            boolean flag = true;
            int p = 0;
            for (int j = 0; j < query.length(); j++) {
                char c = query.charAt(j);
                if (p < pattern.length() && pattern.charAt(p) == c) {
                    p++;
                } else if (Character.isUpperCase(c)) {
                    flag = false;
                    break;
                }
            }
            if (p < pattern.length()) {
                flag = false;
            }
            res.add(flag);
        }
        return res;
    }
}

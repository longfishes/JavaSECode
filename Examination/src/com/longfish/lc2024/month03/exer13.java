package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exer13 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (String cpdomain : cpdomains) {
            int cnt = Integer.parseInt(cpdomain.substring(0, cpdomain.indexOf(' ')));
            String[] strs = cpdomain.substring(cpdomain.indexOf(' ') + 1).split("\\.");

            for (int i = 0; i < strs.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < strs.length; j++) {
                    sb.append(strs[j]);
                    sb.append('.');
                }
                map.merge(sb.substring(0, sb.length() - 1), cnt, Integer::sum);
            }
        }
        List<String> ans = new ArrayList<>();
        map.keySet().forEach(key -> {
            String sb = String.valueOf(map.get(key)) +
                    ' ' +
                    key;
            ans.add(sb);
        });

        return ans;
    }

    @Test
    public void test1() {
        System.out.println(subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }

    @Test
    public void test2() {
        System.out.println(subdomainVisits(new String[]{"10 leetcode.cn"}));
    }
}

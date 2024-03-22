package com.longfish.lc2024.month03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exer13 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        int firstCnt = Integer.parseInt(cpdomains[0].substring(0, cpdomains[0].indexOf(' ')));
        String[] first = cpdomains[0].substring(cpdomains[0].indexOf(' ') + 1).split("\\.");

        for (int i = 0; i < first.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < first.length; j++) {
                sb.append(first[j]);
                sb.append('.');
            }
            map.put(sb.substring(0, sb.length() - 1), firstCnt);
        }

        for (int k = 1; k < cpdomains.length; k++) {
            int cnt = Integer.parseInt(cpdomains[k].substring(0, cpdomains[k].indexOf(' ')));
            String[] strs = cpdomains[k].substring(cpdomains[k].indexOf(' ') + 1).split("\\.");

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
}

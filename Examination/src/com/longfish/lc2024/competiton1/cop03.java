package com.longfish.lc2024.competiton1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class cop03 {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {

        Set<Integer> listI = new HashSet<>();
        Set<Integer> listJ = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= s.length() - a.length(); i++) {
            if (s.startsWith(a, i))
                listI.add(i);
        }
        for (int j = 0; j <= s.length() - b.length(); j++) {
            if (s.startsWith(b, j))
                listJ.add(j);
        }
        for (Integer value : listI) {
            for (Integer integer : listJ) {
                if (Math.abs(value - integer) <= k) {
                    ans.add(value);
                    break;
                }
            }
        }
        ans.sort(Integer::compareTo);
        return ans;
    }

    @Test
    public void test1() {
        System.out.println(beautifulIndices("aadsdsdaac", "aa", "", 0));
    }

}

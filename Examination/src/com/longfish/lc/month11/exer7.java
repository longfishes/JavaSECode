package com.longfish.lc.month11;

import org.junit.Test;

import java.util.*;

public class exer7 {
    public int maxProduct(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.length()+o2.length();
            }
        });
        System.out.println(Arrays.toString(words));

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                seen.add(words[i].charAt(j));
            }
            boolean flag = true;
            for (int j = 0; j < words.length && i!=j; j++) {
                for (int k = 0; k < words[j].length(); k++) {
                    if (seen.contains(words[j].charAt(k))) {
                        flag = false;
                        break;
                    }
                }
            if (flag) ans.add(words[i].length()*words[j].length());
            }
        }

        System.out.println(Arrays.toString(ans.toArray()));

        return 0;
    }

    @Test
    public void test(){
        System.out.println(maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
    }
}

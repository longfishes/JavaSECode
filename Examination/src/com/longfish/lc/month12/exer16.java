package com.longfish.lc.month12;

import java.util.ArrayList;
import java.util.List;

public class exer16 {
    public int lengthOfLongestSubstring(String s) {
        List<Character> window = new ArrayList<>();
        lo : for (int i = 0; i < s.length(); i++) {
            if (window.contains(s.charAt(i))){
                for (int j = 0; j <= window.indexOf(s.charAt(i)); j++) {
                    if (2 * window.indexOf(s.charAt(i)) + 2 < window.size())
                        window.remove(j);
                    else break lo;
                }
            }
            window.add(s.charAt(i));
        }

        System.out.println(window);
        return window.size();
    }
}

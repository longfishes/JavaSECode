package com.longfish.lc.competition3;

import java.util.ArrayList;
import java.util.List;

public class cop04 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}

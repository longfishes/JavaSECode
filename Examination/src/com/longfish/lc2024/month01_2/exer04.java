package com.longfish.lc2024.month01_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class exer04 {
    public void reverseString(char[] s) {
        List<Character> list = new ArrayList<>();
        for (char c : s) {
            list.add(c);
        }
        Collections.reverse(list);
        list.forEach(new Consumer<Character>() {
            int n = 0;
            @Override
            public void accept(Character character) {
                s[n++] = character;
            }
        });
    }
}

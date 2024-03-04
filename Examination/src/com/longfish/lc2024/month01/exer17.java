package com.longfish.lc2024.month01;

import java.util.*;

public class exer17 {
    public int countWords(String[] words1, String[] words2) {
        int ans = 0;
        List<String> list1 = new ArrayList<>();
        Set<String> list2 = new HashSet<>();
        Arrays.stream(words1).distinct().forEach(list1::add);
        Arrays.stream(words1).distinct().forEach(list2::add);


        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) ans++;
        }

        return ans;
    }
}

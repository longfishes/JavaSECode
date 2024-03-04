package com.longfish.lc.month11;

import org.junit.Test;

import java.util.*;

public class exer6 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> ansSet = new HashSet<>();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length()-9; i++) {
            String str = s.substring(i,i+10);
            if (set.contains(str)){
                ansSet.add(str);
            }
            set.add(str);
        }

        return new ArrayList<>(ansSet);
    }

    @Test
    public void test(){
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}

package com.longfish.lc.month10;

import org.junit.Test;

import java.util.*;

public class exer17 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Set<Set<Character>> stringSet = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < strs[i].length(); j++) {
                set.add(strs[i].charAt(j));

            }
            stringSet.add(set);
        }

//        for (int i = 0; i < strs.length; i++) {
//            Set<Character> set = new HashSet<>();
//            for (int j = 0; j < strs[i].length(); j++) {
//                set.add(strs[i].charAt(j));
//            }
//            List<String> l = new ArrayList<>();
//            for (int j = 0; j < stringSet.size(); j++) {
//                for (int k = 0; k < strs[j].length(); k++) {
//                    if (stringSet.toArray()[j].equals(set)) l.add(strs[k]);
//                }
//
//            }
//            list.add(l);
//
//        }
        System.out.println(Arrays.toString(stringSet.toArray()));
        return list;
    }


    @Test
    public void test(){
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

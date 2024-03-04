package com.longfish.lc.competition2;

import org.junit.Test;

import java.util.*;

public class cop06 {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String,List<Integer>> map = new HashMap<>();
        for (List<String> access_time : access_times) {
            if (!map.containsKey(access_time.get(0))) {
                map.put(access_time.get(0),
                        new ArrayList<>(Collections.singletonList(parseMinute(access_time.get(1)))));
            } else map.get(access_time.get(0)).add(parseMinute(access_time.get(1)));
        }

        for (List<Integer> integers : map.values()) {
            Collections.sort(integers);
        }

        List<String> ansList = new ArrayList<>();

        for (String s : map.keySet()) {
            for (int i = 0; i < map.get(s).size()-2; i++) {
                if (map.get(s).get(i+2)-map.get(s).get(i)<60) {
                    ansList.add(s);
                    break;
                }
            }
        }

        return ansList;
    }

    public int parseMinute(String str){
        int hour = Integer.parseInt(str.substring(0,2));
        int minutes = Integer.parseInt(str.substring(2,4));

        return hour*60+minutes;
    }

    @Test
    public void test2(){

    }


    @Test
    public void test1(){
        System.out.println(parseMinute("1111"));
    }
}

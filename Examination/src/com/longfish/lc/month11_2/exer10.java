package com.longfish.lc.month11_2;

import org.junit.Test;

import java.util.*;

public class exer10 {
    public int maximumSum(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(parse(num))) {
                list.add(num + map.get(parse(num)));
                if (num > map.get(parse(num)))map.put(parse(num), num);
                else continue;
            }
            map.put(parse(num), num);
        }
        if (list.size()==0)return -1;
        return Collections.max(list);
    }

    public int parse(int num){
        String str = String.valueOf(num);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res += Integer.parseInt(str.charAt(i)+"");
        }
        return res;
    }



    @Test
    public void test1(){
        System.out.println(parse(10));
        System.out.println(parse(17));
    }
}

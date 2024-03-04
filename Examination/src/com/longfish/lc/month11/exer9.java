package com.longfish.lc.month11;

import org.junit.Test;

import java.util.*;

public class exer9 {
    public int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else map.put(num,1);
        }
//        System.out.println(map);

//        int[] sum = new int[map.size()];
//        for(int i = 0; i < map.size(); i++){
//            sum[i] = (int)map.keySet().toArray()[i]*map.get((int)map.keySet().toArray()[i]);
//        }

        return 0;

    }

    @Test
    public void test1(){
        System.out.println(deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }
}

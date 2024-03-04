package com.longfish.lc.month11_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer12 {

    public int minDeletion(int[] nums) {
        int count = 0;
        List<Integer> list = toList(nums);

        int n = list.size() - 1;
        while (!check(list)){
            if (n <= 0) n += list.size() - 1;

            if (list.get(n).equals(list.get(n - 1))){
                list.remove(list.get(n));
                n--;
                count++;
            }
        }

        return count;
    }

    public List<Integer> toList(int[] nums){

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;

    }


    public boolean check(int[] nums) {
        if ((nums.length % 2) != 0) return false;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) if (nums[i] == nums[i + 1]) return false;
        }
        return true;
    }

    public boolean check(List<Integer> list){
        if (list.size()%2!=0)return false;
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) if (list.get(i).equals(list.get(i+1)) ) return false;
        }
        return true;


    }


    @Test
    public void test1() {
        System.out.println(check(new int[]{1, 2, 3, 4, 5}));
    }


    @Test
    public void test2(){
        System.out.println(minDeletion(new int[]{1, 1, 2, 3, 5}));
    }

}

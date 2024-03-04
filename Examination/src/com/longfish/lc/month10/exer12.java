package com.longfish.lc.month10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer12 {

    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int Area = 0;
        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < height.length - 1; j++) {
            for (int i = 0; i < height.length - 1 - j; i++) {
                list.add(Math.min(height[i],height[i+j+1])*(j+1));
            }
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>Area) Area = list.get(i);
        }
    }

    public int maxArea(int[] height) {
        int Area = 0;
        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < height.length - 1; j++) {
            for (int i = 0; i < height.length - 1 - j; i++) {
                if (i!=0&&Math.min(height[i-1],height[i+j])*(j+1)<Math.min(height[i],height[i+j+1])*(j+1)){
                    list.remove(list.size()-1);
                }
                list.add(Math.min(height[i],height[i+j+1])*(j+1));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>Area) Area = list.get(i);
        }
        return Area;
    }



    @Test
    public void test(){
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

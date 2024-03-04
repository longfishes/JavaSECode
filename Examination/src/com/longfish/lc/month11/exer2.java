package com.longfish.lc.month11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exer2 {
    class ThreeNums{
        int firstNum;
        int secondNum;
        int thirdNum;
        int count;
        int[] nums = new int[3];
        public void add(int val){
            if (count==0) {
                firstNum = val;
                count++;
            }
            else if (count==1){
                secondNum = val;
                count++;
            }else thirdNum = val;
        }
        public void sort(){
            nums[0] = firstNum;
            nums[1] = secondNum;
            nums[2] = thirdNum;
            Arrays.sort(nums);
        }
        public List<Integer> toArrayList(){
            int[] nums = new int[3];
            nums[0] = firstNum;
            nums[1] = secondNum;
            nums[2] = thirdNum;
            Arrays.sort(nums);
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            list.add(nums[1]);
            list.add(nums[2]);
            return list;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ThreeNums threeNums = (ThreeNums) o;
            return Arrays.equals(nums, threeNums.nums);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(nums);
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length * (nums.length - 1) / 2;
        int[] arr = new int[length];
        int[] indexI = new int[length];
        int[] indexJ = new int[length];
        int count = 0;
        System.out.println(length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                arr[count] = nums[i]+nums[j];
                indexI[count] = i;
                indexJ[count] = j;
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(indexI));
        System.out.println(Arrays.toString(indexJ));

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < nums.length && j!=indexI[i] && j!=indexJ[i]; j++) {
                if (nums[indexI[i]]+nums[indexJ[i]]+nums[j]==0){
                    ThreeNums list1 = new ThreeNums();
                    list1.add(nums[indexI[i]]);
                    list1.add(nums[indexJ[i]]);
                    list1.add(nums[j]);
                    list1.sort();
                    list.add(list1.toArrayList());
                }
            }
        }
        ThreeNums[] threeNums = new ThreeNums[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ThreeNums t = null;
            for (int j = 0; j < 3; j++) {
                t = new ThreeNums();
                t.add(j);
            }
            boolean isFlag = true;
            for (int j = 0; j < i; j++) {
                isFlag = true;
                if (!t.equals(threeNums[j])) isFlag = false;
            }
            if (isFlag) threeNums[i] = t;
        }
        int newLength = 0;
        for (ThreeNums threeNum : threeNums) {
            if (threeNum != null) newLength++;
        }
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < newLength; i++) {
            list1.add(threeNums[i].toArrayList());
        }
        return list1;
    }

    @Test
    public void test() {
        System.out.println(Arrays.toString(threeSum(new int[]{-1, 0, 1, 2, -1, -4}).toArray()));
    }
}

/*
 * Arrays类工具包
 * Arrays.equals
 * Arrays.toString
 * Arrays.fill
 * Arrays.sort
 * Array.binarySearch
 */

import java.util.Arrays;

public class TestArraysClass {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[][] arr0 = {{1,2,3},{2,3,4}};
        System.out.println(arr1 == arr2);

        boolean isEquals = Arrays.equals(arr1,arr2);  //equals判断两个数组是否相同
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr1));  //toString显示数组中的元素
        System.out.println(Arrays.toString(arr0[0]));
        System.out.println(Arrays.toString(arr0));

        Arrays.fill(arr1,10);                   //fill填充所有元素为多少
        System.out.println(Arrays.toString(arr1));

        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);                           //sort快速排序
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr,5); //binarySearch二分法查找，数组必须有序，返回值为索引值，返回负数说明没找到
        if (index >=0){
            System.out.println("索引值为"+index);
        }else{
            System.out.println("没找到");
        }
    }
}

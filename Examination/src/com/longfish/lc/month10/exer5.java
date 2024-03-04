package com.longfish.lc.month10;

public class exer5 {
    public int[] intersect(int[] nums1, int[] nums2) {      //num1长num2短（或一样长）
        int[] temp = nums1;
        if(nums1.length<nums2.length){
            nums1 = nums2;
            nums2 = temp;
        }
        return null;
    }
}

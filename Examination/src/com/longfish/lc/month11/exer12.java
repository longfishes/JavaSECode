package com.longfish.lc.month11;

import org.junit.Test;

import java.util.Arrays;

public class exer12 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int target = (int)Math.ceil(((double)success/spells[i]));
            while (true){

                int i1 = Arrays.binarySearch(potions, target);

                if ( spells[i] *(long)potions[0]>=success){
                    ans[i] = potions.length;
                    break;
                }

                if (spells[i] *(long)potions[potions.length-1]<success){
                    ans[i] = 0;
                    break;
                }

                if (i1>=0 && i1<potions.length){
                    ans[i] = potions.length-i1;

                    //    for (int j = 1; j < potions.length - i1; j++) {
                    //        if (i1+j<potions.length&&potions[i1+j]==potions[i1]) ans[i]++;
                    //        else break;
                    //    }

                    for (int j = 1; j < potions.length; j++) {
                        if (i1-j>=0&&potions[i1-j]==potions[i1]) ans[i]++;
                        else break;
                    }

                    break;
                }
                target++;
            }



        }
        return ans;
    }

    @Test
    public void test2(){
        System.out.println(Arrays.toString(successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16)));
    }

    @Test
    public void test3(){
        System.out.println(Arrays.toString(successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7)));
    }


    @Test
    public void test(){
        System.out.println(Math.ceil(2.1));
    }
}

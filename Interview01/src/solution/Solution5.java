package solution;

import org.junit.Test;

import java.util.*;

public class Solution5 {
    public int[][] method(int[][] nums){
        boolean[][] indexes = new boolean[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j]==0){
                    for (int k = 0; k < nums.length; k++) {
                        indexes[k][j] = true;
                    }
                    for (int k = 0; k < nums[0].length; k++) {
                        indexes[i][k] = true;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (indexes[i][j])nums[i][j] = 0;
            }
        }
        return nums;
    }


    @Test
    public void test(){
        System.out.println(Arrays.deepToString(method(new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}})));
    }
}

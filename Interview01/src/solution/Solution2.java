package solution;

import org.junit.Test;

import java.util.Arrays;

public class Solution2 {
    public int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target)return new int[]{Math.min(i,j),Math.max(i,j)};
            }
        }
        return null;
    }


    @Test
    public void test(){
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }
}

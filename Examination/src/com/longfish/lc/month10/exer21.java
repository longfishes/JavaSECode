package com.longfish.lc.month10;

public class exer21 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (true){
            if (num==0)return count;
            else if (num%2==0){
                num/=2;
                count++;
            }else {
                num-=1;
                count++;
            }
        }
    }
}

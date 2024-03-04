package com.longfish.cppteamexer;

import org.junit.Test;

public class exer3 {
    public void print(int n){
        int a = 2*n-1;
        int[][] arr = new int[a][a];
        arr[n-1][n-1]=n;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i==0||j==0||i==a-1||j==a-1) arr[i][j]=1;
                for (int k = 1; k < n; k++) {
                    if (i==k||j==k||i==a-1-k||j==a-1-k) arr[i][j]=k;
                }


                if (i!=0&&j!=0&&i<n&&j<n) {
                    arr[i][j]=Math.min(i,j)+1;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }


    @Test
    public void test(){
        print(4);
    }
}

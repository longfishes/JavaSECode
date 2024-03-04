package com.longfish.lc.month10;

public class exer3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,2,4,2,2,18};
        exer3 exer3 = new exer3();
        System.out.println(exer3.method(arr));
    }

    public int method(int[] arr){
        if (arr.length%2==0) {
            int a = 0;
            int b = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) a += arr[i];
                else b += arr[i];
            }
            return Math.max(a, b);
        }else if (arr.length == 1){
            return arr[0];
        }
        else {
            int[] arr01 = {0,0,0};

                for (int j = 0; j < arr.length; j++) {
                    if (j%2==0 && j != arr.length-1)arr01[0] += arr[j];
                    if (j%2!=0) arr01[1] += arr[j];
                    if (j%2==0 && j != 0)arr01[2] += arr[j];

                }

            return Math.max(arr01[2],Math.max(arr01[0],arr01[1]));
        }
    }
}

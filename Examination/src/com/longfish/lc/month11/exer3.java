package com.longfish.lc.month11;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.next();
        }
        int minLength = 20000000;
        for (int i = 0; i < length; i++) {
            if (arr[i].length()<minLength) minLength = arr[i].length();
        }
        String result = "";
        int n = 0;
        for (int i = 0; i < minLength; i++) {
            boolean flag = false;
            for (int j = 0; j < length - 1; j++) {
                if (arr[j].charAt(i)==arr[j+1].charAt(i)) flag = true;
                else flag = false;
            }
            if (flag) {
                result += arr[0].charAt(n);
                n++;
            }
        }
        System.out.println(result);
    }
}

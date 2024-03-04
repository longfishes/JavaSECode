package com.longfish.lc.month10;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double max;
        double min;
        double[] total = new double[3];
        double[] avg = new double[3];
        double[][] arr = new double[3][5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("现在输入第" + (i + 1) + "位选手的打分");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("请输入第" + (j + 1) + "位评委的打分");
                arr[i][j] = s.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            max = 0;
            min = 100;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
                total[i] += arr[i][j];
            }
            avg[i] = (total[i] - max - min) / 3;
        }
        if (avg[0] > avg[1] && avg[0] > avg[2]) {
            System.out.println("第一名：选手1\t平均得分：" + avg[0]);
            if (avg[1] > avg[2]) {
                System.out.println("第二名：选手2\t平均得分：" + avg[1]);
                System.out.println("第三名：选手3\t平均得分：" + avg[2]);
            } else {
                System.out.println("第二名：选手3\t平均得分：" + avg[2]);
                System.out.println("第三名：选手2\t平均得分：" + avg[1]);
            }
        } else if (avg[1] > avg[2]) {
            System.out.println("第一名：选手2\t平均得分：" + avg[1]);
            if (avg[0] > avg[2]) {
                System.out.println("第二名：选手1\t平均得分：" + avg[0]);
                System.out.println("第三名：选手3\t平均得分：" + avg[2]);
            } else {
                System.out.println("第二名：选手3\t平均得分：" + avg[2]);
                System.out.println("第三名：选手1\t平均得分：" + avg[0]);
            }
        } else {
            System.out.println("第一名：选手3\t平均得分：" + avg[2]);
            if (avg[0] > avg[1]) {
                System.out.println("第二名：选手1\t平均得分：" + avg[0]);
                System.out.println("第三名：选手2\t平均得分：" + avg[1]);
            } else {
                System.out.println("第二名：选手2\t平均得分：" + avg[1]);
                System.out.println("第三名：选手1\t平均得分：" + avg[0]);
            }
        }
    }
}

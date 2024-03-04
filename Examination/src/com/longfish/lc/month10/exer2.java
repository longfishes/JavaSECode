package com.longfish.lc.month10;

import java.util.Arrays;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        // 以下是使用Java编写的程序，实现了从键盘输入5位评委的评分，计算选手的平均得分，并进行排名。


        Scanner scanner = new Scanner(System.in);

        // 创建一个二维数组来存储评委的评分
        double[][] scores = new double[5][3];

        // 从键盘输入评委的评分
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的评分：");
            for (int j = 0; j < 3; j++) {
                scores[i][j] = scanner.nextDouble();
            }
        }

        // 计算选手的平均得分
        double[] averageScores = new double[5];
        for (int i = 0; i < 5; i++) {
            // 对每位评委的评分进行排序
            Arrays.sort(scores[i]);

            // 去掉一个最高分和一个最低分，计算平均得分
            double sum = 0;
            for (int j = 1; j < 3; j++) {
                sum += scores[i][j];
            }
            averageScores[i] = sum / 2;
        }

        // 对选手的平均得分进行排名
        int[] ranking = new int[5];
        for (int i = 0; i < 5; i++) {
            ranking[i] = i + 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (averageScores[j] < averageScores[j + 1]) {
                    // 交换平均得分
                    double tempScore = averageScores[j];
                    averageScores[j] = averageScores[j + 1];
                    averageScores[j + 1] = tempScore;

                    // 交换排名
                    int tempRanking = ranking[j];
                    ranking[j] = ranking[j + 1];
                    ranking[j + 1] = tempRanking;
                }
            }
        }

        // 输出排名结果
        System.out.println("排名结果：");
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + ranking[i] + "名选手的平均得分为：" + averageScores[i]);
        }
    }
}
// 这个程序会先从键盘输入5位评委的评分，然后计算出每个选手的平均得分，并进行排名。程序使用了一个二维数组来存储评委的评分，其中每一行表示一个评委的评分，每一列表示一个选手的得分。然后，对每个评委的评分进行排序，去掉一个最高分和一个最低分，计算出选手的平均得分。最后，根据选手的平均得分进行排名，输出排名结果。



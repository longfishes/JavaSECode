package com.longfish.lc.month12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerPartition {

    public List<List<Integer>> give(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPartition = new ArrayList<>();
        giveHelper(n, n, currentPartition, result);
        return result;
    }

    public void giveHelper(int n, int max, List<Integer> currentPartition, List<List<Integer>> result) {
        if (n == 0) {
            // 当n为0时，当前的partition是一个有效的拆分
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i = 1; i <= Math.min(n, max); i++) {
            currentPartition.add(i);
            giveHelper(n - i, i, currentPartition, result);
            currentPartition.remove(currentPartition.size() - 1);
        }
    }

    public static void main(String[] args) {
        IntegerPartition i = new IntegerPartition();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<List<Integer>> partitions = i.give(number);

        System.out.println("拆分" + number + "的所有加数构成的集合：");
        for (List<Integer> partition : partitions) {
            System.out.println(partition);
        }
    }
}

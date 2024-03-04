package com.longfish.lc2024.month01_2;

public class exer12 {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;

        int alice = 0;
        int bob = 0;

        int[] realValues = new int[n];

        for (int i = 0; i < n; i++) {
            realValues[i] = aliceValues[i] + bobValues[i];
        }

        boolean flag = false;
        for (int j = 0; j < n; j++) {
            int max = 0;
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (realValues[i] > max) {
                    max = realValues[i];
                    index = i;
                }
            }
            realValues[index] = 0;
            if (flag) bob += bobValues[index];
            else alice += aliceValues[index];
            flag = !flag;
        }

        return Integer.compare(alice, bob);
    }
}

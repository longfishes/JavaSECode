package com.longfish.lc2024.month04;

public class exer03 {
    public boolean lemonadeChange(int[] bills) {
        int ten = 0;
        int five = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
                continue;
            }
            if (bill == 10) {
                ten++;
                five--;
                if (five < 0) return false;
            } else {
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
                if (five < 0 || ten < 0) return false;
            }
        }
        return true;
    }
}

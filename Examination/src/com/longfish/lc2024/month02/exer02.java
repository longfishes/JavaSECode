package com.longfish.lc2024.month02;

public class exer02 {
    public int game(int[] guess, int[] answer) {
        int n = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) n++;
        }
        return n;
    }
}

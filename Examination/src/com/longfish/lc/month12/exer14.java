package com.longfish.lc.month12;

public class exer14 {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = 0;
        int score2 = 0;

        for (int i = 0; i < player1.length; i++) {
            if ((i - 1 >= 0 && player1[i - 1] == 10) ||
                    (i - 2 >= 0 && player1[i - 2] == 10))
                score1 += 2 * player1[i];
            else score1 += player1[i];

        }

        for (int i = 0; i < player2.length; i++) {
            if ((i - 1 >= 0 && player2[i - 1] == 10) ||
                    (i - 2 >= 0 && player2[i - 2] == 10))
                score2 += 2 * player2[i];
            else score2 += player2[i];

        }

        return score1 == score2 ? 0 : score1 > score2 ? 1 : 2;
    }
}

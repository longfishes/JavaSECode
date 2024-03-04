package com.longfish.lc2024.month02;

public class exer12 {
    public void gameOfLife(int[][] board) {
        int[][] res = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int cnt = 0;
                if (i + 1 < board.length) cnt += board[i + 1][j];
                if (j + 1 < board[0].length) cnt += board[i][j + 1];
                if (i - 1 >= 0) cnt += board[i - 1][j];
                if (j - 1 >= 0) cnt += board[i][j - 1];
                if (i + 1 < board.length && j + 1 < board[0].length) cnt += board[i + 1][j + 1];
                if (i - 1 >= 0 && j - 1 >= 0) cnt += board[i - 1][j - 1];
                if (i - 1 >= 0 && j + 1 < board[0].length) cnt += board[i - 1][j + 1];
                if (i + 1 < board.length && j - 1 >= 0) cnt += board[i + 1][j - 1];

                if (cnt < 2 || cnt > 3) res[i][j] = 0;
                else if (cnt == 3) res[i][j] = res[i][j] = 1;
                else res[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(res[i], 0, board[i], 0, board[0].length);
        }
    }
}

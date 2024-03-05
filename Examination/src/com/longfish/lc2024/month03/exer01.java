package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer01 {
    public int countBattleships(char[][] board) {
        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X'){
                    int x = i;
                    int y = j;
                    while (++x < board.length && board[x][y] == 'X'){
                        board[x][y] = '.';
                    }
                    x = i;
                    while (--x > 0 && board[x][y] == 'X'){
                        board[x][y] = '.';
                    }
                    x = i;
                    while (++y < board[0].length && board[x][y] == 'X'){
                        board[x][y] = '.';
                    }
                    y = j;
                    while (--y > 0 && board[x][y] == 'X'){
                        board[x][y] = '.';
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }

    @Test
    public void test1() {
        System.out.println(countBattleships(new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));
    }
}

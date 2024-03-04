package com.longfish.lc2024.month02;

public class exer04 {
    public boolean robot(String command, int[][] obstacles, int x, int y) {
        int curX = 0;
        int curY = 0;
        int iter = 0;
        while (true){
            if (command.charAt(iter) == 'U') curY++;
            else curX++;
            if (curX == x && curY == y) return true;
            for (int[] obstacle : obstacles) {
                if (curX == obstacle[0] && curY == obstacle[1]) return false;
            }
            if (curX > x || curY > y) return false;

            iter++;
            iter %= command.length();
        }
    }
}

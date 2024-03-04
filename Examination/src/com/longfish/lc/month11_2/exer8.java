package com.longfish.lc.month11_2;

public class exer8 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[][] ins = new boolean[numCourses][numCourses];
        boolean[][] outs = new boolean[numCourses][numCourses];


        for (int i = 0; i < prerequisites.length; i++) {
            ins[prerequisites[i][0]][prerequisites[i][1]] = true;
            outs[prerequisites[i][0]][prerequisites[i][1]] = true;
        }

        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                if (i!=j)if (ins[i][j]&&outs[i][j])return false;
            }
        }
        return true;
    }
}

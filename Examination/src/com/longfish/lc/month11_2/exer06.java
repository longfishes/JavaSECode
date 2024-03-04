package com.longfish.lc.month11_2;

public class exer06 {
    public int findCenter(int[][] edges) {
        int max = 0;
        for (int[] edge : edges) {
            if (Math.max(edge[0], edge[1]) > max)
                max = Math.max(edge[0], edge[1]);
        }
        int[] nodes = new int[max];
        for (int[] edge : edges) {
            nodes[edge[0]]++;
            nodes[edge[1]]++;
        }

        int max2 = 0;
        int index = -1;
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i]>max2) {
                max2 = nodes[i];
                index = i;

            }
        }

        return index+1;
    }


}

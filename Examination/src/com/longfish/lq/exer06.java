package com.longfish.lq;

import org.junit.Test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class exer06 {

    @Test
    public void test1() {
        int n = 3;
        int[] nodes = new int[n];

        List<? extends Serializable> list = Arrays.asList(
                "add 1",
                "add 2",
                "query",
                "add 1",
                "sync 1",
                "sync 1",
                "sync 2",
                "query",
                "sync 1",
                "query",
                "sync 2",
                "sync 2",
                "sync 1",
                "query");
        for (Serializable serializable : list) {
            String s = (String) serializable;
            if (s.contains("add")) {
                nodes[0]++;
            }
            if (s.contains("sync")) {
                String[] split = s.split(" ");
                int cnt = Integer.parseInt(split[1]);
                nodes[cnt]++;
            }
            if (s.contains("query")) {
                int min = Integer.MAX_VALUE;
                for (int node : nodes) {
                    if (node < min) min = node;
                }
                System.out.println(min);
            }
        }
    }
}

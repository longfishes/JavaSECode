package com.longfish.lc2024.month01;

import org.junit.Test;

import java.awt.*;

public class exer13 {
    public int numberOfBoomerangs(int[][] points) {
        Point[] ps = new Point[points.length];
        int ans = 0;
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Point(points[i][0], points[i][1]);
        }

        for (Point p : ps) {
            for (int j = 0; j < ps.length; j++) {
                for (int k = j + 1; k < ps.length; k++) {
                    if (p.distance(ps[j]) == p.distance(ps[k])) ans++;
                }
            }
        }

        return ans * 2;
    }

    @Test
    public void test1() {

    }
}

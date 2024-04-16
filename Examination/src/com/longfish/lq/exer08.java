package com.longfish.lq;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class exer08 {

    @Test
    public void test1() {
        long ans = 0;
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 10, 0),
                Arrays.asList(6, 6, 0),
                Arrays.asList(8, 6, 1),
                Arrays.asList(6, 10, 0),
                Arrays.asList(1, 2, 1));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!list.get(i).get(2).equals(list.get(j).get(2))) {
                    Integer i1 = list.get(i).get(0);
                    Integer i2 = list.get(j).get(0);
                    Integer i3 = list.get(i).get(1);
                    Integer i4 = list.get(j).get(1);
                    if ((i1 > i2 && i3 < i4) || (i1 < i2 && i3 > i4)) {
                        ans++;
                        ans %= 1000000007;
                    }
                }
            }
        }
        System.out.println("the ans is : " + ans % 1000000007);
    }

    @Test
    public void test2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] l = new int[n];
        int[] w = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            String[] str = bufferedReader.readLine().split(" ");
            l[i] = Integer.parseInt(str[0]);
            w[i] = Integer.parseInt(str[0]);
            c[i] = Integer.parseInt(str[0]);
        }
        long count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i] != c[j] && ((l[i] > l[j] && w[i] < w[j]) || (l[i] < l[j] && w[i] > w[j]))) {
                    count++;
                    count %= 1000000007;
                }
            }
        }
        System.out.println(count % 1000000007);
    }
}

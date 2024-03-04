package com.longfish.lc.month12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class exer17 {
    public List<String> generateParenthesis(int n) {
        List<List<Integer>> give = give(n);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < give.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < give.get(i).size(); j++) {
                sb.append(generator(give.get(i).get(j)));
            }
            ans.add(sb.toString());
        }

        return ans;
    }

    public String generator(int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('(');
        }
        for (int i = 0; i < n; i++) {
            sb.append(')');
        }

        return sb.toString();
    }

    public List<List<Integer>> give(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPartition = new ArrayList<>();
        giveHelper(n, n, currentPartition, result);
        return result;
    }

    public void giveHelper(int n, int max, List<Integer> currentPartition, List<List<Integer>> result) {
        if (n == 0) {

            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i = 1; i <= Math.min(n, max); i++) {
            currentPartition.add(i);
            giveHelper(n - i, i, currentPartition, result);
            currentPartition.remove(currentPartition.size() - 1);
        }
    }


    @Test
    public void test3() {
        System.out.println(generateParenthesis(3));
    }



    @Test
    public void test1() {
        System.out.println(generator(2));
    }

    @Test
    public void test2() {
        System.out.println(give(1));
        System.out.println(give(2));
        System.out.println(give(3));
        System.out.println(give(4));
    }
}

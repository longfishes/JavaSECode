package com.longfish.lc.month11;

import org.junit.Test;

public class exer5_2 {
    public int concatenatedBinary(int n) {
        final int MOD = 1000000007;
        long ans = 0; // 使用 long 类型以避免整数溢出

        for (int i = 1; i <= n; i++) {
            String binaryStr = Integer.toBinaryString(i); // 将当前整数转换为二进制字符串
            ans = (ans * (1L << binaryStr.length()) % MOD + i) % MOD; // 更新计算结果
        }

        return (int) ans; // 将 long 类型结果转换为 int 类型并返回
    }


    @Test
    public void test(){
        System.out.println(concatenatedBinary(519));
    }
}

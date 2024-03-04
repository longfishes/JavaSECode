package com.longfish.lc2024.month02;

import org.junit.Test;

public class exer07 {
    private boolean isBadVersion(int version){
        return version >= 1702766719;
    }

    public int firstBadVersion(int n) {
        int head = 0;
        while (head <= n){
            int mid = (int)((head + (long)n) / 2);
            boolean flag = isBadVersion(mid);
            if (flag && !isBadVersion(mid - 1)) return mid;
            else if (flag) n = mid - 1;
            else head = mid + 1;
        }

        return 0;
    }

    @Test
    public void test1() {
        System.out.println(firstBadVersion(2126753390));
    }
}

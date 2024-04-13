package com.longfish.lc2024.month04;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exer02 {

    @Test
    public void test1() {
        LocalDateTime cur = LocalDateTime.now();
        cur = cur.plusYears(-1970);
        cur = cur.plusMonths(-1);

        String format = cur.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(format);
    }
}

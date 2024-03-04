package com.longfish.lc.month12;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exer20 {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public int dayOfYear(String date) {
        Date from = null;
        Date cur = null;
        try {
            from = new Date(String.valueOf(sdf.parse(date.substring(0,4) + "-01-01")));
            cur = new Date(String.valueOf(sdf.parse(date)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assert from != null;
        assert cur != null;
        return (int)((cur.getTime() - from.getTime()) / 24 / 3600 / 1000) + 1;
    }

    @Test
    public void test1() {
        System.out.println(dayOfYear("2023-1-12"));
    }
}

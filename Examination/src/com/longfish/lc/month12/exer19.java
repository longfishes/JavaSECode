package com.longfish.lc.month12;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class exer19 {
    public String dayOfTheWeek(int day, int month, int year) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Sunday");
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(3, "Wednesday");
        map.put(4, "Thursday");
        map.put(5, "Friday");
        map.put(6, "Saturday");


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = new Date(String.valueOf(sdf.parse(year + "-" + month + "-" + day)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assert date != null;
        return map.get(date.getDay());
    }

    @Test
    public void test1() {
        System.out.println(dayOfTheWeek(31, 12, 2023));
    }
}

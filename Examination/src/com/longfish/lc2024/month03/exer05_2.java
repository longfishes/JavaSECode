package com.longfish.lc2024.month03;

import org.junit.Test;

public class exer05_2 {
    public String capitalizeTitle(String title) {
        String[] split = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            if (s.length() < 3) sb.append(s.toLowerCase());
            else {
                sb.append((s.charAt(0) + "").toUpperCase());
                sb.append(s.substring(1).toLowerCase());
            }
            sb.append(' ');
        }
        return sb.substring(0, sb.length() - 1);
    }

    @Test
    public void test1() {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe of 1 fjdsalkfk leeteCodee"));
    }
}

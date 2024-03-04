package com.longfish.lc.month11_2;

import org.junit.Test;

public class exer13 {
    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder(text);


        for (int i = 0; i < sb.length() - 5; i++) {
            if (sb.substring(i, i + 6).equals("&quot;")) {
                sb.replace(i, i + 6, "\"");

            }
        }
        for (int i = 0; i < sb.length() - 5; i++) {
            if (sb.substring(i, i + 6).equals("&apos;")) {
                sb.replace(i, i + 6, "'");

            }
        }

        for (int i = 0; i < sb.length() - 4; i++) {
            if (sb.substring(i, i + 5).equals("&amp;")) {
                sb.replace(i, i + 5, "&");

            }
        }

        for (int i = 0; i < sb.length() - 3; i++) {
            if (sb.substring(i, i + 4).equals("&gt;")) {
                sb.replace(i, i + 4, ">");

            }
        }

        for (int i = 0; i < sb.length() - 3; i++) {
            if (sb.substring(i, i + 4).equals("&lt;")) {
                sb.replace(i, i + 4, "<");

            }
        }

        for (int i = 0; i < sb.length() - 6; i++) {
            if (sb.substring(i, i + 7).equals("&frasl;")) {
                sb.replace(i, i + 7, "/");

            }
        }

        return sb.toString();
    }


    @Test
    public void test1() {
        String str = "12345";
        System.out.println(str.substring(0, 2));
    }

    @Test
    public void test2() {


    }
}

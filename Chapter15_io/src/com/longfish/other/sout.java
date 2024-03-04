package com.longfish.other;

import org.junit.Test;

import java.io.*;

public class sout {
    @Test
    public void test1() throws FileNotFoundException {
        File file = new File("turnsout.txt");
        OutputStream fr = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fr);

        System.setOut(ps);

        System.out.println("114514");
    }
}

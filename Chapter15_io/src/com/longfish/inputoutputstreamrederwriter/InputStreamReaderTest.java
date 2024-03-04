package com.longfish.inputoutputstreamrederwriter;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {
    @Test
    public void test1(){
        FileInputStream fr;
        InputStreamReader isr = null;
        try {
            File file = new File("hello.txt");

            fr = new FileInputStream(file);
            isr = new InputStreamReader(fr,"gbk");

            int data;
            while ((data = isr.read()) != -1)
                System.out.print((char)data);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

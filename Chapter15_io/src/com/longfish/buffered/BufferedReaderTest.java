package com.longfish.buffered;

import org.junit.Test;

import java.io.*;

public class BufferedReaderTest {
    @Test
    public void test1() throws IOException {
        File file = new File("testfile.txt");
        FileReader fr = new FileReader(file);

        char[] cBuffer = new char[1024];
        int len = fr.read(cBuffer);

        while (len != -1){
            for (int i = 0; i < len; i++) {
                System.out.print(cBuffer[i]);
            }
            len = fr.read(cBuffer);
        }
        fr.close();
    }

    @Test
    public void test2() throws IOException {
        File file = new File("testfile.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        char[] cBuffer = new char[1024];
        int len = br.read(cBuffer);

        while (len != -1){
            for (int i = 0; i < len; i++) {
                System.out.print(cBuffer[i]);
            }
            len = br.read(cBuffer);
        }
        br.close();
    }
}

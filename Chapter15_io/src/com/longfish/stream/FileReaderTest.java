package com.longfish.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    @Test
    public void test1(){
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            fr = new FileReader(file);

            int data;
            while ((data = fr.read()) != -1)
                System.out.print((char)data);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //优化：每次读取多个字符，存储在char[]数组当中，减少与磁盘交互的次数
    @Test
    public void test2(){
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            fr = new FileReader(file);

            char[] cBuffer = new char[1024];
            int len = fr.read(cBuffer);
            while (len != -1){
                for (int i = 0; i < len; i++) {
                    System.out.print(cBuffer[i]);
                }
                len = fr.read(cBuffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3(){
        File file = new File("hello.txt");
        System.out.println(file.length());
    }
}

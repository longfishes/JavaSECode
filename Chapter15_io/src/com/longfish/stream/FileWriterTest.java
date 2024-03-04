package com.longfish.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    @Test
    public void test1(){
        FileWriter fw = null;
        try {
            File file = new File("info.txt");
            fw = new FileWriter(file,true);//fw = new FileWriter(file,false);//追加：false
//            fw = new FileWriter(file,true);//追加：true

            for (int i = 0; i < 10; i++) {
                fw.write("114514\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}

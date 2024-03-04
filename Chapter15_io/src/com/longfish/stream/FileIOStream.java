package com.longfish.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File file = new File("微信图片_20230821091802.jpg");
            File file2 = new File("微信图片_20230821091802_copy.jpg");
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2,false);

            byte[] buffer = new byte[1024*8];
            int len = fis.read(buffer);

            while (len != -1){
                for (int i = 0; i < len; i++) {
                    fos.write(buffer[i]);
                }
                len = fis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}

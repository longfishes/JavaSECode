package com.longfish.buffered;

import org.junit.Test;

import java.io.*;

public class BufferedStreamTest {
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            File file = new File("微信图片_20230821091802.jpg");
            File file2 = new File("微信图片_20230821091802_copy2.jpg");
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2,false);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len = bis.read(buffer);

            while (len != -1){
                for (int i = 0; i < len; i++) {
                    bos.write(buffer[i]);
                }
                len = bis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bos != null;
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            try {
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        }
    }
}

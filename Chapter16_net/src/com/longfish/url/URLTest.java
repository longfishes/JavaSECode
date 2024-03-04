package com.longfish.url;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
    @Test
    public void test1() throws MalformedURLException {
        String str = "http://192.168.1.1:1145/longfish/sikadi.jpg?name=wife";
        URL url = new URL(str);

        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
    }

    @Test
    public void test2() throws IOException {
        String str = "http://192.168.1.1:1145/longfish/sikadi.jpg?name=wife";
        URL url = new URL(str);

        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        InputStream is = huc.getInputStream();
        File file = new File("1145");
        FileOutputStream fos = new FileOutputStream(file);

        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        while (len!=-1){
            fos.write(buffer,0,len);
            len = is.read(buffer);
        }

        fos.close();
        is.close();
        huc.disconnect();
    }

    @Test
    public void testDownloads() throws MalformedURLException {
        String api = "https://cdn.seovx.com/d/?mom=302";
        URL url = new URL(api);

        for (int i = 500; i < 601; i++) {
            try {
                System.out.println(i);
                HttpURLConnection huc = (HttpURLConnection) url.openConnection();
                InputStream is = huc.getInputStream();
                File file = new File("E:\\本地资源库\\夏沫\\" + i + ".jpg");
                FileOutputStream fos = new FileOutputStream(file);

                byte[] buffer = new byte[1024];
                int len = is.read(buffer);
                while (len!=-1){
                    fos.write(buffer,0,len);
                    len = is.read(buffer);
                }
                fos.close();
                is.close();
                huc.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
                i--;
            }
        }

    }
}

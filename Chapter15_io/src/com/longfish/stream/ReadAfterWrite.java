package com.longfish.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class ReadAfterWrite {
    @Test
    public void test1() {
        FileWriter fw = null;
        try {
            File file = new File("test02.txt");
            fw = new FileWriter(file);
            fw.write("jfdlskjflkdsj743837483");
            System.out.println("successful!");
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

    @Test
    public void test2() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file = new File("test02.txt");
            File file2 = new File("test02_new.txt");

            fr = new FileReader(file);
            fw = new FileWriter(file2,false);

            int data = fr.read();

            while (data != -1) {
                if (data >= '0'&&data <= '9'){
                    System.out.print(" "+convert(Integer.parseInt((char)data+"")));
                    fw.write(" "+convert(Integer.parseInt((char)data+"")));
                }
                else {
                    String str = (char)data+"";
                    System.out.print(str.toUpperCase(Locale.ROOT));
                    fw.write(str.toUpperCase(Locale.ROOT));
                }

                data = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                assert fr != null;
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String convert(int num){
        String[] map = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (num >= 0 && num <= 9)return map[num];
        return "";
    }
}

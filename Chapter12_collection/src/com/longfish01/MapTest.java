package com.longfish01;

import org.junit.Test;

import java.io.*;
import java.util.*;

public class MapTest {
    @Test
    public void test1(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("hello",114514);
        map.put("i want to join",1);

        if (map.containsValue(1)){          //自动装箱
            System.out.println("有");
        }else System.out.println("没有");

        Collection<Integer> values = map.values();
    }

    @Test
    public void test2() throws IOException {
        File file = new File("info.properties");
        System.out.println(file.getAbsolutePath());


        FileInputStream fis = new FileInputStream(file);

        Properties props = new Properties();
        props.load(fis);

        String name = props.getProperty("name");
        String password = props.getProperty("password");

        System.out.println(name+"="+password);

        fis.close();
    }
}

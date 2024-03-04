package com.longfish.file;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class FileTest {

    @Test
    public void test1(){
        File file = new File("long");
        System.out.println(file.exists());
        System.out.println(file.length());//具体文件调length返回字节数，文件目录调length返回0
        System.out.println(file.lastModified());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());

    }

    @Test
    public void test2(){
        File file = new File("fish.txt");
        System.out.println(file.exists());
        System.out.println(file.lastModified());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile().getParent());
    }

    //文件目录
    @Test
    public void test3(){
        File file = new File("longfish");
        System.out.println(file.length());//具体文件调length返回字节数，文件目录调length返回0


        System.out.println(Arrays.toString(file.list()));
        System.out.println(Arrays.toString(file.listFiles()));//可以遍历整个文件目录下的所有file

        File file2 = new File("");
        System.out.println(Arrays.toString(file2.list()));//null
    }

    //重命名
    @Test
    public void test4(){
        File file = new File("rename03.txt");
        boolean flag = file.renameTo(new File("rename114514.txt"));


        System.out.println(flag);
    }

    //创建与删除
    @Test
    public void test5() throws IOException {
        File file = new File("create.txt");
        System.out.println(file.createNewFile());

        //file.mkdir()上级目录不存在就不创建，返回值boolean
        //file.mkdirs()无论上级目录是否存在都直接一并创建


        System.out.println(file.delete());//删除文件目录，必须删除目录下的所有文件（用listFiles()方法）

    }
}

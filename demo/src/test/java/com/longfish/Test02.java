package com.longfish;

import org.junit.Test;

import java.io.File;

public class Test02 {

    @SuppressWarnings("all")
    public void deleteFilesInDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (!file.delete()) deleteFilesInDirectory(file);
            }
        }
    }

    @Test
    public void test4() {
        ZipUtil.deleteDirectoryAndFiles("E:\\Administrator\\IdeaProject\\demo\\src\\main\\resources\\test");
    }

    @Test
    public void test2() {
        deleteFilesInDirectory(new File("E:\\Administrator\\IdeaProject\\demo\\src\\main\\resources"));
    }


    @Test
    public void test1() {
        deleteFilesInDirectory(new File("E:\\Administrator\\IdeaProject\\demo\\src\\main\\resources"));
        ZipUtil.decompress(
                "E:\\Administrator\\IdeaProject\\demo\\src\\main\\resources.zip",
                "E:\\Administrator\\IdeaProject\\demo\\src\\main");
    }

    @Test
    public void test3() {
        System.out.println(new File("E:\\Administrator\\IdeaProject\\demo\\src\\main\\resources\\teststest\\fjdslkajk").delete());
    }
}

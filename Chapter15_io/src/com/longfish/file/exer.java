package com.longfish.file;

import org.junit.Test;

import java.io.File;

public class exer {
    @Test
    public void test(){
        File file = new File("E:\\Administrator\\IdeaProject\\Chapter15_io");
        printFiles(file);
    }

    public void printFiles(File file){
        if (file.isFile()) System.out.println(file);
        else {
            if (file.isDirectory()){
                File[] files = file.listFiles();
                if (files != null) {
                    for(File f : files) printFiles(f);
                }
            }
        }
    }
}

package com.longfish;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

public class Test01 {

    @Test
    public void test1() {
        File file = new File("src/main/java/com/longfish");
        File[] files = file.listFiles();

        System.out.println(file.getAbsoluteFile());
        System.out.println(Arrays.toString(files));


        assert files != null;
        System.out.println(files.length);

        Arrays.sort(files);
        System.out.println(Arrays.toString(files));
    }
}

package com.longfish;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class FolderCompressionExample {

    public static void compressFolder(String sourceFolder, String destinationFile) {
        try {
            Path sourcePath = Paths.get(sourceFolder);
            OutputStream outputStream = new FileOutputStream(destinationFile);
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);

            Files.walk(sourcePath)
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        try (InputStream inputStream = new FileInputStream(file.toFile())) {
                            byte[] buffer = new byte[1024];
                            int bytesRead;
                            while ((bytesRead = inputStream.read(buffer)) > 0) {
                                gzipOutputStream.write(buffer, 0, bytesRead);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

            gzipOutputStream.finish();
            gzipOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceFolder = "demo\\111";
        String destinationFile = "E:\\Administrator\\IdeaProject\\demo\\test.tar.gz";

        compressFolder(sourceFolder, destinationFile);
    }
}

package com.demo.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {

        File myFile = new File("demo.txt");
        File destinationFile = new File("copy-demo.txt");

        try {
            FileUtils.copyFile(myFile, destinationFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

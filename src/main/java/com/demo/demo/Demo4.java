package com.demo.demo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {

        File myFile = new File("NewDemo.txt");

        String absolutePath = myFile.getAbsolutePath();
        System.out.println(absolutePath);
        String extensionFile = FilenameUtils.getExtension(absolutePath);
        System.out.println(extensionFile);


        String fileName = FilenameUtils.getName(absolutePath);
        System.out.println(fileName);

        String path = FilenameUtils.getFullPath(absolutePath);
        System.out.println(path);
    }
}

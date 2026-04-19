package com.demo.demo;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

        File myFile = new File("demo.txt");// File will be created in the root level of the project- calculator
        // path reference
        try {
            FileUtils.writeStringToFile(myFile, "Iam determined\n", StandardCharsets.UTF_8);
            // this method doesn't append content
            FileUtils.writeStringToFile(myFile, "Iam hard working\n",StandardCharsets.UTF_8,true);
            FileUtils.writeStringToFile(myFile, "Iam hard working\n",StandardCharsets.UTF_8,true);
            FileUtils.writeStringToFile(myFile, "Iam hard working\n",StandardCharsets.UTF_8,true);
            // boolean append
        }
        catch(IOException e){
            e.printStackTrace();
        }

       //Write multiple lines in 1 go

        List<String> lines = Arrays.asList("Athira", "Ajinkya", "Neil");
        try {
            FileUtils.writeLines(myFile,lines, true);
        }
        catch(IOException e){
            e.printStackTrace();
        }

// Reading from file
        String data;
        try {
            data = FileUtils.readFileToString(myFile, StandardCharsets.UTF_8);
            System.out.println(data);
        }
                catch(IOException e){
            e.printStackTrace();
        }
        // Reading From File and Storing it in a list
        List<String> dataLines = null;
        try{
        dataLines = FileUtils.readLines(myFile,StandardCharsets.UTF_8);
            System.out.println(dataLines);
    } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(dataLines.get(7));
        }
    }
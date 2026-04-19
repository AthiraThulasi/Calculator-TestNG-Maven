package com.demo;

import java.io.*;

public class Demo {

    public static void main(String[] args) {

        File myFile = new File("demo.txt");// File will be created in the root level of the project- calculator
        // path reference
        try {
            myFile.createNewFile();// physically creates file
        } catch (IOException e) {
            e.printStackTrace();

        }
            FileWriter fileWriter;// FileWriter- class //fileWriter - reference
            //Class declaration should be outside try catch
            try {
                fileWriter = new FileWriter(myFile);
                fileWriter.write("This is demo");
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        FileReader fr;
        BufferedReader br;

        try{
            fr = new FileReader(myFile);
            br = new BufferedReader(fr);
            String data = br.readLine();
            System.out.println(data);
        }

catch (IOException e){
            e.printStackTrace();
}
        }

    }
package com.gl.excepciones.example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFile {


    public static void main(String[] args) {

        ExampleFile example = new ExampleFile();

        example.doNotCloseResourceInTry();
        example.closeResourceInFinally();
        example.automaticallyCloseResource();
    }


    public void doNotCloseResourceInTry() {
        FileInputStream inputStream = null;
        try {
            File file = new File("./tmp.txt");
            file.getAbsolutePath();
            inputStream = new FileInputStream(file);

            // use the inputStream to read a file

            // do NOT do this
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }



    public void closeResourceInFinally() {
        FileInputStream inputStream = null;
        try {
            File file = new File("./tmp.txt");
            inputStream = new FileInputStream(file);

            // use the inputStream to read a file

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }


    public void automaticallyCloseResource() {
        File file = new File("./tmp.txt");

        try (FileInputStream inputStream = new FileInputStream(file);) {
            // use the inputStream to read a file

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

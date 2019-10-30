package com.example.aservice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestThree {
    public static void main(String[] args) {


        try {
            FileInputStream fileInputStream = new FileInputStream("");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}

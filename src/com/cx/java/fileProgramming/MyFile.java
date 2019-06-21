package com.cx.java.fileProgramming;

import java.io.*;
import java.util.*;

public class MyFile {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
//        String filePath = "/home/myb/argus/ContentViolationDtc/crawler_output/04c04bee3089ecf0-2019-04-23-16_36_48";
//        File file = new File(filePath + "/screenshot");
////        File[] fs = file.listFiles();
////        System.out.println(fs[0]);
//        List<File[]> fileList = cutFile(file);
//        for (File[] fs : fileList) {
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//            for (File f : fs) {
//                if (f.exists()) {
//                    System.out.println(f);
//                }
//            }
//
//            System.out.println(fs.length);
//            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//
//        }
//        StringBuffer sb = new StringBuffer();
//        sb.append("");
//        sb.append("");

    }

    public static List<File[]> cutFile(File file) {
        List<File[]> files = new ArrayList<>();
        File[] fs = file.listFiles();
        float num = (float) fs.length / 32;
        int number = (int) Math.ceil(num);
        for (int i = 0; i < number; i++) {
            if (i + 1 == number) {
                int length = fs.length - i * 32;
            }
            int length = (i + 1 == number) ? fs.length - i * 32 : 32;
            File[] files1 = new File[length];
            for (int j = 0; i * 32 + j < fs.length && j < 32; j++) {
                files1[j] = fs[i * 32 + j];
            }
            files.add(files1);
        }
        return files;
    }
}

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFile {
    private final String FILE = "D:\\files\\sem2\\50.txt";
    private int n = 0;
    private int[] arr;
    public void create(int[] arr) {
        try {
            File file = new File(FILE);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(FILE);
            n = arr.length;
            for (int i = 0; i < arr.length; i++) {
                fileWriter.write(arr[i]+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    public int[] read(){
        arr = new int[n];
        try {
            File file = new File(FILE);
            Scanner sc = new Scanner(file);
            int i = 0;
            while (sc.hasNextInt()){
                arr[i] = sc.nextInt();
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return arr;
    }
}
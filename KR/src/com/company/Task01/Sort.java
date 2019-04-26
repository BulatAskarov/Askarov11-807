package com.company.Task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Sort {
    private ArrayList<String> arrayList = new ArrayList<>();
    private final String FILE = "D:\\DZ\\askarov_11-807\\KR\\src\\com\\company\\Task01\\Words.txt";




    public ArrayList<String> sort(Predicate<String> predicate){
        read();
        ArrayList<String> arrayList1  = new ArrayList<>();
        for (String e : arrayList){
            if (predicate.test(e) && !arrayList1.contains(e)){
                arrayList1.add(e);
            }
        }
        return arrayList1;
    }




    private ArrayList<String> read(){
        try {
            File file = new File(FILE);
            Scanner sc = new Scanner(file);
            int i = 0;
            while (sc.hasNextInt()){
                arrayList.add(sc.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return arrayList;
    }
}

package com.company.Task02;

import java.util.ArrayList;

public class Speed {

    private ArrayList<Runnner> arrayList = new ArrayList<>();
    private int[] arr;

    public Speed(int[] arr){
        this.arr = arr;
    }

    public ArrayList<Runnner> top10(int n, Comparator c) {
        int k;
        for (int i = 0; i < arr.length; i++) {
            k = 0;
            for (Runnner e : arrayList){
                if (e.getSpeed() < arr[i]){
                    arrayList.add(e);
                    break;
                }
                k++;
            }
        }
        k = 0;
        ArrayList<Runnner> arrayList1 = new ArrayList<>();
        while (k != n){
            for (Runnner e : arrayList){
                arrayList1.add(e);
                k++;
            }
        }
        return arrayList1;
    }
}

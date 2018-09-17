package com.company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите кол-во чисел:");
        int n = sc.nextInt();
        String arr1 = "", arr2 = "";
        System.out.println("введите массив №1:");
        for (int i = 0; i < n; i++) {
            arr1 += sc.nextInt();
        }
        System.out.println("введите кол-во чисел:");
        int m = sc.nextInt();
        System.out.println("введите массив №2:");
        for (int i = 0; i < m; i++) {
            arr2 += sc.nextInt();
        }
        int a = arr1.indexOf(arr2);
        if (a > -1) {
            System.out.println("индкс: " + a);
        } else {
            System.out.println("не входит");
        }
    }
}
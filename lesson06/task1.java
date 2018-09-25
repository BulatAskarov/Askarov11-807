package com.company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите колво слов");
        int n = sc.nextInt();
        System.out.println("введитке массив");
        String arr[] = new String[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                if (arr[i].length() > arr[j].length()) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
            }
        }

    }
        System.out.println(arr[]);
}
}
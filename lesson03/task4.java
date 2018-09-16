package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите колво чисел");
        int n = sc.nextInt();
        int b = n / 2;
        System.out.println("введите массив");
        int[] arr = new int[n];
        String a = "yes";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < b; i++) {
            if (arr[i] >= arr[i - 1]) {
                a = "yes";
            } else {
                a = "no";
            }
        }
        for (int i = b + 2; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                a = "yes";
            } else {
                a = "no";
            }
        }
        System.out.println(a);
    }
}

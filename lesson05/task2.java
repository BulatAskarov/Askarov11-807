package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите слово: ");
        String s1 = sc.next();
        int a = s1.length();
        char b = 42;
        char[] arr = s1.toCharArray();
        for (int i = 0; i < a; i++) {
            if (arr[i] >= '0' & arr[i] <= '9') {
                arr[i] = '*';
            }
            System.out.print(arr[i]);
        }
    }
}
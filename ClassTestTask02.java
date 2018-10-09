package com.company;

import java.util.Scanner;
// варивнт 2
public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int n = arr.length;
        int a = 0;
        for (int i = 0; i < n; i = i + 2) {
            if (arr[i++] == '+') {
                a += arr[i];
            }
            if (arr[i++] == '-') {
                a -= arr[i];
            }
            System.out.println(a);
        }
    }
}



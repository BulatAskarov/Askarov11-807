package com.company;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите колво чисел");
        int n = sc.nextInt();
        System.out.println("введите массив");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n-1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

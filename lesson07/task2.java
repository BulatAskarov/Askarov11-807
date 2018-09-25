package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int n = sc.nextInt();
        System.out.println(b(n));
    }

    public static int b(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + b(n / 10);
        }
    }
}

package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int a = sc.nextInt();
        int b = 1;
        rec(a, b);

    }

    public static void rec(int n, int k) {

        if (n % k == 0) {
            System.out.println(k);
        }
        if (n == k){
            return;
        }

        rec(n, k + 1);
    }
}

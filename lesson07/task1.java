package com.company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        double n = sc.nextInt();
        if (b(n) == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static int b(double n) {
        if (n == 1) {
            return 1;
        }
        else if (n > 1 && n < 2) {
            return 0;
        }
        else {
            return b(n / 2);
        }
    }


}

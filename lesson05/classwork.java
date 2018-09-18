package com.company;

import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String s;
        int a = 0;
        int b;
        while (1 == n) {
            System.out.println("введите 1/0 чтобы вкл/выкл калькулятор");
            n = sc.nextInt();
            if (a == 0) {
                a = sc.nextInt();
            }
            String op = sc.next();
            b = sc.nextInt();
            if (op.equals("+")) {
                System.out.println(a += b);
            }
            if (op.equals("-")) {
                System.out.println(a -= b);
            }
            if (op.equals("*")) {
                System.out.println(a *= b);
            }
            if (op.equals("/")) {
                System.out.println(a = a / b);
            }
            System.out.println("сбросить?");
            s = sc.next();
            if (s.equals("да")) {
                a = 0;
            }
        }
    }
}

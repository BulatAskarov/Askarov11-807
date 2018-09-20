package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String s1 = sc.next();
        int a = s1.length();
        char[] s2 = s1.toCharArray();
        for (int i = 0; i < a; i++) {
            int b;
            System.out.print(b = Character.getNumericValue(s2[i]));
        }
    }
}



package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String s1 = sc.next();
        System.out.println("введите индекс");
        String a = sc.next();
        if (a.equals("u")) {
            System.out.println(s1.toUpperCase());
        }
        else {
            System.out.println(s1.toLowerCase());
        }
    }
}



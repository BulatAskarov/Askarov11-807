package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите слово: ");
        String s1 = sc.next();
        char[] str = s1.toCharArray();
        StringBuilder s2 = new StringBuilder();
        s2.append(str[str.length - 2]);
        s2.append(str[str.length - 1]);
        for (int i = 0; i < s1.length() - 2; i++) {
            s2.append(str[i]);
        }
        System.out.println(s2);
    }
}
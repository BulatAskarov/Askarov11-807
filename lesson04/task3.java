package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите слово");
        String s = sc.next();
        System.out.println("введите индексы");
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuffer sb = new StringBuffer(s);
        sb.delete(a,b + 1);
        System.out.println("слово: " + sb);
    }
}

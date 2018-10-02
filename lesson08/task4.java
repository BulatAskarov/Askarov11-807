package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число строк и столбцов");
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println("введите матрицу");
        int[][] matrix = new int[n][a];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int l = 0;
        int q;
        int w;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a; j++) {
                w = 2;
                q = 0;
                while (n != w) {
                    if (matrix[i][j] > matrix[0 + q][j] & matrix[i][j] < matrix[i][0 + q]) {
                        l = matrix[i][j];
                    } else {
                        a = 0;
                    }
                    q++;
                    w++;
                }
                System.out.println(l);
            }
        }
    }
}
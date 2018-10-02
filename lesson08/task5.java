package com.company;

import java.util.Scanner;

public class task5 {
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
        System.out.println("введите число строк и столбцов 2-ой матрицы");
        int m = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("введите матрицу");
        int[][] matrix1 = new int[m][b];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        if (a == m) {
            int z = 0;
            int l = 0;
            int v = 0;
            int k = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < b; j++) {
                    for (int o = 0; o < n; o++) {
                        z += matrix[n - k][l] * matrix1[v][o];
                        k++;
                    }
                    l++;
                    v++;
                    System.out.println(z);
                }
            }
        }

    }
}

package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число строк и столбцов");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("введите матрицу");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int index = 0;
        int a = 0;
        while (a != n) {
            for (int i = 0; i < n; i++) {
                sum = matrix[a][i];
            }
            if (sum > max) {
                index = a;
            }
            a += 1;
        }
        int index1 = 0;
        int b = 0;
        int sum1 = 0;
        int max1 = Integer.MIN_VALUE;
        while (b != m) {
            for (int i = 0; i < m; i++) {
                sum1 = matrix[i][b];
            }
            if (sum1 > max1) {
                index1 = b;
            }
            b += 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[index][i] + " ");
        }
        System.out.println("  ");
        for (int i = 0; i < m; i++) {
            System.out.print(matrix[i][index1] + " ");
        }
    }
}

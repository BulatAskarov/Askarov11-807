package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите размер матрицы");
        int s = sc.nextInt();
        System.out.println("введите матрицу");
        int[][] matrix = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        MatrixLine matrixLine = new MatrixLine(matrix, s);
        System.out.println(matrixLine.matrixLine());
        System.out.println("Введите x и y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(matrixLine.near(x, y));
    }
}

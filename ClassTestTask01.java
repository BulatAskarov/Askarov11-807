package com.company;
//вариант 2

import java.util.Arrays;
import java.util.Scanner;

public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[matrix1.length];
        int k = 0;
        for (int i = 0; i < matrix1.length; i++) {
            arr[i] = matrix1[k][k];
            k++;
        }

        getSideDiagonalAsVector(matrix1);
        mult(matrix1, arr);
    }

    static void getSideDiagonalAsVector(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[n][n];
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void mult(int[][] matrix, int[] arr) {
        int n = matrix.length;
        int[] vector= new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int l = 0; l < n; l++) {
                    sum += matrix[i][l] * arr[i];
                }
                vector[i] = sum;
            }
        }
        System.out.println(Arrays.toString(vector));
    }
}



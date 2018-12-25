package com.company;

public class MatrixLine {
    private int[][] matrix;
    private int maxIndex;
    private int count;
    private int min = Integer.MAX_VALUE;
    private int index;
    private boolean near;

    public MatrixLine(int[][] matrix, int maxIndex) {
        this.matrix = matrix;
        this.maxIndex = maxIndex;
    }

    public int matrixLine() {
        for (int i = 0; i < maxIndex; i++) {
            for (int j = 0; j < maxIndex; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
            if (count < min) {
                min = count;
                index = i;
            }
            count = 0;
        }
        int sum = 0;
        for (int i = 0; i < maxIndex; i++) {
            sum+=matrix[index][i];
        }
        return sum;
    }

    public boolean near(int x, int y) {
        if (x != index - 1 || y != index - 1 || x == 0 || y == 0) {
            if (matrix[x][y] == matrix[x + 1][y + 1] || matrix[x][y] == matrix[x + 1][y] || matrix[x][y] == matrix[x][y + 1]) {
                near = true;
            }
        }
        if (x == index - 1 || y == index - 1 || x != 0 || y != 0) {
            if (matrix[x][y] == matrix[x - 1][y - 1] || matrix[x][y] == matrix[x - 1][y] || matrix[x][y] == matrix[x][y - 1]) {
                near = true;
            }
        }
        if (x != index - 1 && y != index - 1 && x != 0 && y != 0) {
            if (matrix[x][y] == matrix[x + 1][y + 1] || matrix[x][y] == matrix[x + 1][y] || matrix[x][y] == matrix[x][y + 1]|| matrix[x][y] == matrix[x - 1][y - 1] || matrix[x][y] == matrix[x - 1][y] || matrix[x][y] == matrix[x][y - 1]) {
                near = true;
            }
        }
        return near;
    }
}

package com.dominika.dojo;

public class DiagonalDifference {

    static int solution(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int rowIntex = 0;
        int leftDiagonalSum = 0;
        do { //left to right diagonal
            leftDiagonalSum = leftDiagonalSum + arr[rowIntex][rowIntex];
            rowIntex++;
        } while (rowIntex < rows);

        int rightDiagonalSum = 0;
        rowIntex = 0;
        int columnIndex = columns - 1;
        do { //left to right diagonal
            rightDiagonalSum = rightDiagonalSum + arr[rowIntex][columnIndex];
            rowIntex++;
            columnIndex--;
        } while (columnIndex >= 0);

        int diagonalDifference = leftDiagonalSum - rightDiagonalSum;
        return Math.abs(diagonalDifference);
    }
}

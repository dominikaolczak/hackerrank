package com.dominika.dojo;

public class Puzzle2DArray {

    // Complete the hourglassSum function below.
    public static int solution(int[][] arr) {
        int maximumHourglassSum = 0;
        boolean isRealSum = false;
        int lastRowForHourGlasses = arr.length - 2;
        int lastColumnForHourGlasses = arr[0].length - 2;
        int currentHourglassRow = 1;
        int currentHourglassColumn = 1;
        do {
            do {
                int hourglassSum = calculateHourglass(arr, currentHourglassRow, currentHourglassColumn);
                if (maximumHourglassSum < hourglassSum || isRealSum == false) {
                    maximumHourglassSum = hourglassSum;
                    isRealSum = true;
                }
                currentHourglassColumn++;
            } while (currentHourglassColumn <= lastRowForHourGlasses);
            currentHourglassColumn = 1;
            currentHourglassRow++;
        } while (currentHourglassRow <= lastColumnForHourGlasses);

        return maximumHourglassSum;
    }

    private static int calculateHourglass(int[][] matrix, int hourGlassRow, int hourglassColumn) {
        int hourglassSum =
                        matrix[hourGlassRow - 1][hourglassColumn - 1] + matrix[hourGlassRow - 1][hourglassColumn] + matrix[hourGlassRow - 1][hourglassColumn + 1] +
                        matrix[hourGlassRow][hourglassColumn] +
                        matrix[hourGlassRow + 1][hourglassColumn - 1] + matrix[hourGlassRow + 1][hourglassColumn] + matrix[hourGlassRow + 1][hourglassColumn + 1];
        return hourglassSum;
    }

}

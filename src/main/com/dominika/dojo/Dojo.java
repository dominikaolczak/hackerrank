package com.dominika.dojo;

import java.util.*;

public class Dojo {

    protected static int[][] baseSquare = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
    protected static int[][] verticalFlipSquare = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
    protected static int[][] horizontalFlipSquare = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
    protected static int[][] climbDiagonalFlipSquare = {{6, 3, 2}, {1, 5, 9}, {8, 7, 4}};
    protected static int[][] decendDiagonalFlipSquare = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
    protected static int[][] mirrorSquare = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
    protected static int[][] rotateLeftSquare = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
    protected static int[][] rotateRightSquare = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};

    protected static Integer baseSquareMinimalCost = null;
    protected static Integer verticalFlipMinimalCost = null;
    protected static Integer horizontalFlipMinimalCost = null;
    protected static Integer climbDiagonalMinimalCost = null;
    protected static Integer decendDiagonalMinimalCost = null;
    protected static Integer mirrorMinimalCost = null;
    protected static Integer rotateLeftMinimalCost = null;
    protected static Integer rotateRightMinimalCost = null;

    public static int formingMagicSquare(int[][] s) {
        Integer minimalCost = null;
        boolean costInitialized = false;
        int size = 3;

        initMagicSquareCombinationCosts(s);
        if (isCurrentMinimalCost(costInitialized, baseSquareMinimalCost, minimalCost)) {
            minimalCost = baseSquareMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, verticalFlipMinimalCost, minimalCost)) {
            minimalCost = verticalFlipMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, horizontalFlipMinimalCost, minimalCost)) {
            minimalCost = horizontalFlipMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, climbDiagonalMinimalCost, minimalCost)) {
            minimalCost = climbDiagonalMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, decendDiagonalMinimalCost, minimalCost)) {
            minimalCost = decendDiagonalMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, mirrorMinimalCost, minimalCost)) {
            minimalCost = mirrorMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, rotateLeftMinimalCost, minimalCost)) {
            minimalCost = rotateLeftMinimalCost;
            costInitialized = true;
        }
        if (isCurrentMinimalCost(costInitialized, rotateRightMinimalCost, minimalCost)) {
            minimalCost = rotateRightMinimalCost;
            costInitialized = true;
        }
        return minimalCost.intValue();
    }

    private static void initMagicSquareCombinationCosts(int[][] s) {
        resetSingletonContext();
        int size = 3;
        int row = 0;
        do {
            int column = 0;
            do {
                Integer temp = calculateMinimalCost(s, baseSquare, size);
                if (baseSquareMinimalCost == null || temp < baseSquareMinimalCost) {
                    baseSquareMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, verticalFlipSquare, size);
                if (verticalFlipMinimalCost == null || temp < verticalFlipMinimalCost) {
                    verticalFlipMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, horizontalFlipSquare, size);
                if (horizontalFlipMinimalCost == null || temp <= horizontalFlipMinimalCost) {
                    horizontalFlipMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, climbDiagonalFlipSquare, size);
                if (climbDiagonalMinimalCost == null || temp < climbDiagonalMinimalCost) {
                    climbDiagonalMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, decendDiagonalFlipSquare, size);
                if (decendDiagonalMinimalCost == null || temp < decendDiagonalMinimalCost) {
                    decendDiagonalMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, mirrorSquare, size);
                if (mirrorMinimalCost == null || temp < mirrorMinimalCost) {
                    mirrorMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, rotateLeftSquare, size);
                if (rotateLeftMinimalCost == null || temp < rotateLeftMinimalCost) {
                    rotateLeftMinimalCost = temp;
                }
                temp = calculateMinimalCost(s, rotateRightSquare, size);
                if (rotateRightMinimalCost == null || temp < rotateRightMinimalCost) {
                    rotateRightMinimalCost = temp;
                }
                column++;
            } while (column < size);
            row++;
        } while (row < size);
    }

    private static boolean isCurrentMinimalCost(boolean costInitialized, Integer squareCost, Integer minimalCost) {
        if (squareCost == null) {
            return false;
        }
        return !costInitialized || squareCost < minimalCost;
    }

    private static Integer calculateMinimalCost(int[][] s, int[][] magicSquare, int size) {
        Integer cost = 0;
        int row = 0;
        do {
            int column = 0;
            do {
                cost = cost + Math.abs(s[row][column] - magicSquare[row][column]);
                column++;
            } while (column < size);
            row++;
        } while (row < 3);
        return cost;
    }

    private static void resetSingletonContext() {
        //Due to static context the platform acts as a singleton and keeps the state between test runs.
        baseSquareMinimalCost = null;
        verticalFlipMinimalCost = null;
        horizontalFlipMinimalCost = null;
        climbDiagonalMinimalCost = null;
        decendDiagonalMinimalCost = null;
        mirrorMinimalCost = null;
        rotateLeftMinimalCost = null;
        rotateRightMinimalCost = null;
    }


    //NOT YET SOLVED
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        /*int index = 0;
        do {
            int j = index + 1;
            if(arr[index] != (index+1)) {
                do {
                    if (arr[j] == arr[index]) {

                    }
                    j++;
                } while (j < arr.length);
            }
            index++;
        } while (index < arr.length);*/
        return swaps;
    }

    static String findNumber(List<Integer> arr, int k) {
        for (Integer listInteger : arr) {
            if (listInteger.intValue() == k) {
                return "YES";
            }
        }
        return "NO";
    }
}


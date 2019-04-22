package com.dominika.dojo;

import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Dojo {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int Rotation_Number = a.length - d;
        int arr[] = new int[size];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(Integer.valueOf((a[i])));
        }
        Collections.rotate(list, Rotation_Number);
        int[] res = list.stream().mapToInt(i -> i).toArray();
        return res;
    }

    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNumbers = new ArrayList<Integer>();
        int lowestOddNumber = l;
        if (l == r) { //one number as input
            if (isRangeLowestOddNumber(l)) { //od number
                oddNumbers.add(new Integer(lowestOddNumber));
            }
            return oddNumbers;
        }
        if (!isRangeLowestOddNumber(l)) {
            lowestOddNumber = l + 1;
            oddNumbers.add(new Integer(lowestOddNumber));
        } else {
            oddNumbers.add(new Integer(lowestOddNumber));
        }
        int i = lowestOddNumber;
        do {
            lowestOddNumber = lowestOddNumber + 2;
            if (lowestOddNumber > r) {
                return oddNumbers;
            }
            oddNumbers.add(new Integer(lowestOddNumber));
        } while (lowestOddNumber < r);

        return oddNumbers;
    }

    private static boolean isRangeLowestOddNumber(int l) {
        if (l % 2 == 0) {
            return false;
        }
        return true;
    }

    public static Map<Integer, List<Integer>> insertionSort1(int n, int[] array) {
        Map<Integer, List<Integer>> sortingIntermediates = new HashMap<Integer, List<Integer>>();
        int length = n;
        if (length == 1) {
            printCurrentSorting(array);
            storeSorting(1, array, sortingIntermediates);
            return sortingIntermediates;
        }
        int i = length - 1;
        int key = array[i];
        int next = i - 1;
        int iteration = n - 1;
        do {
            array[next + 1] = array[next];
            printCurrentSorting(array);
            storeSorting(iteration, array, sortingIntermediates);
            next--;
            iteration--;
        } while (next >= 0 && array[next] > key);
        array[next + 1] = key;
        printCurrentSorting(array);
        storeSorting(iteration, array, sortingIntermediates);
        return sortingIntermediates;
    }

    private static void printCurrentSorting(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.print("\n");
    }

    private static Map<Integer, List<Integer>> storeSorting(int iteration, int[] array, Map<Integer, List<Integer>> sortingMap) {
        List<Integer> iterationList = new ArrayList<>();
        int i = 0;
        do {
            iterationList.add(array[i]);
            i++;
        } while (i < array.length);
        sortingMap.put(array.length - iteration, iterationList);
        return sortingMap;
    }

    public static List<Long> miniMaxSum(int[] arr) {
        long maxSum = 0L;
        long minSum = 0L;
        int i = 0;
        long[] sortedArray = selectionSort(arr);

        int start = 0;
        int end = 3;
        boolean minSumInitialized = false;
        do {
            long sum = sortedArray[start] + sortedArray[start + 1] + sortedArray[start + 2] + sortedArray[end];
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (!minSumInitialized) {
                minSum = sum;
                minSumInitialized = true;
            } else if (minSumInitialized && minSum > sum) {
                minSum = sum;
            }
            start++;
            end++;
        } while (end < sortedArray.length);

        System.out.println(minSum + " " + maxSum);
        List<Long> sums = new ArrayList<>();
        sums.add(new Long(minSum));
        sums.add(new Long(maxSum));
        return sums;
    }

    private static long[] selectionSort(int[] input) {
        int inputLength = input.length;
        long[] longInput = new long[input.length];
        int k = 0;
        //transform to a long array
        do {
            longInput[k] = input[k];
            k++;
        } while (k < input.length);

        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;
            // find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (longInput[j] < longInput[min]) {
                    min = j;
                }
            }
            // swaps the smallest value with the position 'i'
            long temp = longInput[i];
            longInput[i] = longInput[min];
            longInput[min] = temp;
        }
        return longInput;
    }

    public static int birthdayCakeCandles(int[] ar) {
        Map<Integer, Integer> candlesByHight = new HashMap<>();
        int i = 0;
        do {
            Integer candleHight = new Integer(ar[i]);
            Integer number = candlesByHight.get(candleHight);
            if (number == null) {
                candlesByHight.put(candleHight, 1);
            } else {
                candlesByHight.put(candleHight, number + 1);
            }
            i++;
        } while (i < ar.length);
        Integer maxHight = 0;
        Integer candleCountForBlownCandles = 0;
        for (Integer height : candlesByHight.keySet()) {
            Integer candleCount = candlesByHight.get(height);
            if (maxHight < height) {
                maxHight = height;
                candleCountForBlownCandles = candleCount;
            }
        }
        return candleCountForBlownCandles.intValue();
    }

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


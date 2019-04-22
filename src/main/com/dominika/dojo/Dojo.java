package com.dominika.dojo;

import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Dojo {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
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

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> finalScore = new ArrayList<>();
        int aScore = 0;
        int bScore = 0;
        int size = a.size();
        int i = 0;
        do {
            if (a.get(i) > b.get(i)) {
                aScore++;
            } else if (a.get(i) < b.get(i)) {
                bScore++;
            }
            i++;
        } while (i < size);
        finalScore.add(aScore);
        finalScore.add(bScore);
        return finalScore;
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long bigSum = 0;
        int arrayLength = ar.length;
        int iterator = 0;
        do {
            bigSum = bigSum + ar[iterator];
            iterator++;
        } while (iterator < arrayLength);
        return bigSum;
    }

    // Complete the plusMinus function below.
    static String plusMinus(int[] arr) {
        int arraySize = arr.length;

        int positiveValues = 0;
        int negativeValues = 0;
        int zeros = 0;
        int index = 0;
        do {
            if (arr[index] == 0) {
                zeros++;
            } else if (arr[index] > 0) {
                positiveValues++;
            } else {
                negativeValues++;
            }
            index++;
        } while (index < arraySize);

        double positiveFraction = (double) positiveValues / (double) arraySize;
        double zeroFraction = (double) zeros / (double) arraySize;
        double negativeFraction = (double) negativeValues / (double) arraySize;

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(positiveFraction) + "\n");
        stringBuffer.append(String.valueOf(negativeFraction) + "\n");
        stringBuffer.append(String.valueOf(zeroFraction));
        return stringBuffer.toString();
    }

    static String staircase(int n) {
        int whiteSpaces = n - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int index = 1;
        do {
            stringBuffer.append(createStaircaseLine(whiteSpaces, n));
            stringBuffer.append("\n");
            index++;
            whiteSpaces--;
        } while (index < n);
        stringBuffer.append(createStaircaseLine(0, n));
        return stringBuffer.toString();
    }

    static private String createStaircaseLine(int numberOfWhiteSpaces, int totalNumberOfSteps) {
        StringBuffer buffer = new StringBuffer();
        int index = 0;
        if (numberOfWhiteSpaces != 0) {
            do {
                buffer.append(" ");
                index++;
            } while (index < numberOfWhiteSpaces);
        }
        index = 0;
        do {
            buffer.append("#");
            index++;
        } while (index < (totalNumberOfSteps - numberOfWhiteSpaces));
        return buffer.toString();
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
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

    //Via Efficient bubble sort
    static String minimumBribes(int[] q) {
        int swaps = 0;
        int maximumAllowedBribesPerPerson = 2;
        int i = 0;
        do {
            int positionResult = q[i] - (i + 1);
            if (positionResult > maximumAllowedBribesPerPerson) {
                return "Too chaotic";
            }
            i++;
        } while (i < q.length);
        i = 0;
        do {
            boolean is_sorted = true;
            int currentSwap = -1;
            int lastSwap = q.length - 1;
            for (int j = 0; j < lastSwap; j++) {
                if (q[j] > q[j + 1]) {
                    int temp = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = temp;
                    is_sorted = false;
                    currentSwap = j;
                    swaps++;
                }
            }
            if (is_sorted) {
                return String.valueOf(swaps);
            }
            lastSwap = currentSwap;
            i++;
        } while (i < q.length);
        return String.valueOf(swaps);
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


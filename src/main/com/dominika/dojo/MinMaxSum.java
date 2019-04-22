package com.dominika.dojo;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    public static List<Long> solution(int[] arr) {
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
}

package com.dominika.dojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertionSort1 {

    public static Map<Integer, List<Integer>> solution(int n, int[] array) {
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
}

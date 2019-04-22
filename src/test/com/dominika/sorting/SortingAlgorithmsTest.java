package com.dominika.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingAlgorithmsTest {

    SortingAlgorithms sorting = new SortingAlgorithms();

    @Test
    public void heapSort() {
        int unsortedArray[] = {9, 10, 5, 3, 1, 2, 6};
        int sortedArray[] = {1, 2, 3, 5, 6, 9, 10};

        int[] result = sorting.heapSort(unsortedArray);
        assertEquals(sortedArray[0], result[0]);
        assertEquals(sortedArray[1], result[1]);
        assertEquals(sortedArray[2], result[2]);
        assertEquals(sortedArray[3], result[3]);
        assertEquals(sortedArray[4], result[4]);
        assertEquals(sortedArray[5], result[5]);
        assertEquals(sortedArray[6], result[6]);

        int oneIntArray[] = {9};

        int[] oneIntArrayResult = sorting.heapSort(oneIntArray);
        assertEquals(9, oneIntArrayResult[0]);
    }

    @Test
    public void quickSort() {
        int[] arr = {4, 5, 1, 2, 3, 3};
        int[] result = sorting.quickSort(arr, 0, arr.length-1);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(3, result[3]);
        assertEquals(4, result[4]);
        assertEquals(5, result[5]);
    }

    @Test
    public void mergeSort() {
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        int[] result = sorting.mergeSort(inputArr);

        assertEquals(4, result[0]);
        assertEquals(11, result[1]);
        assertEquals(23, result[2]);
        assertEquals(28, result[3]);
        assertEquals(43, result[4]);
        assertEquals(45, result[5]);
        assertEquals(65, result[6]);
        assertEquals(77, result[7]);
        assertEquals(89, result[8]);
        assertEquals(98, result[9]);
    }

    @Test
    public void selectionSort() {
        int[] array = {10, 8, 99, 7, 1, 5, 88, 9};
        int[] result = sorting.selectionSort(array);

        assertEquals(1, result[0]);
        assertEquals(5, result[1]);
        assertEquals(7, result[2]);
        assertEquals(8, result[3]);
        assertEquals(9, result[4]);
        assertEquals(10, result[5]);
        assertEquals(88, result[6]);
        assertEquals(99, result[7]);
    }

    @Test
    public void insertionSort() {
        int[] array = {7, 4, 5, 2};
        int[] result = sorting.insertionSort(array);

        assertEquals(2, result[0]);
        assertEquals(4, result[1]);
        assertEquals(5, result[2]);
        assertEquals(7, result[3]);
    }
}

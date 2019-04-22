package com.dominika.sorting;

public class SortingAlgorithms {


    public int[] heapSort(int arrA[]) {
        int size = arrA.length;

        // Build heap
        for (int i = size / 2 - 1; i >= 0; i--)
            buidHeap(arrA, size, i);
        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i = size - 1; i >= 0; i--) {

            //arrA[0] is a root of the heap and is the max element in heap
            int x = arrA[0];
            arrA[0] = arrA[i];
            arrA[i] = x;

            // call max heapify on the reduced heap
            buidHeap(arrA, i, 0);
        }
        return arrA;
    }

    // To heapify a subtree with node i
    private void buidHeap(int arrA[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx = 2 * i + 1; // left = 2*i + 1
        int rightChildIdx = 2 * i + 2; // right = 2*i + 2

        // IThe left child is larger than root
        if (leftChildIdx < heapSize && arrA[leftChildIdx] > arrA[largest])
            largest = leftChildIdx;

        // The right child is larger than largest so far
        if (rightChildIdx < heapSize && arrA[rightChildIdx] > arrA[largest])
            largest = rightChildIdx;

        // The largest is not root
        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

            // heapify the sub-tree
            buidHeap(arrA, heapSize, largest);
        }
    }

    public int[] quickSort(int[] array, int start, int end) {

        int partition = partition(array, start, end);
        if (partition - 1 > start) {
            quickSort(array, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(array, partition + 1, end);
        }
        return array;
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
            }
        }
        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;

        return start;
    }

    private int[] sortedNumbers;
    private int[] helper;
    private int number;

    public int[] mergeSort(int[] values) {
        this.sortedNumbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
        return sortedNumbers;
    }

    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = sortedNumbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                sortedNumbers[k] = helper[i];
                i++;
            } else {
                sortedNumbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            sortedNumbers[k] = helper[i];
            k++;
            i++;
        }
    }

    public int[] selectionSort(int[] input) {
        int inputLength = input.length;
        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;

            // find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }

            // swaps the smallest value with the position 'i'
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        return input;
    }

    public int[] insertionSort(int array[]) {
        int n = array.length;
        for (int i=1; i<n; ++i) {
            int key = array[i];
            int j = i-1;

            //Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            do {
                array[j+1] = array[j];
                j--;
            } while (j>=0 && array[j] > key);
            array[j+1] = key;
        }
        return array;
    }

}

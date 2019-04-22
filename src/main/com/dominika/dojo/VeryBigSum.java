package com.dominika.dojo;

public class VeryBigSum {

    static long solution(long[] ar) {
        long bigSum = 0;
        int arrayLength = ar.length;
        int iterator = 0;
        do {
            bigSum = bigSum + ar[iterator];
            iterator++;
        } while (iterator < arrayLength);
        return bigSum;
    }
}

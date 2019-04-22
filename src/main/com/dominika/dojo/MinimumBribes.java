package com.dominika.dojo;

public class MinimumBribes {

    //Via Efficient bubble sort
    static String solution(int[] q) {
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

}

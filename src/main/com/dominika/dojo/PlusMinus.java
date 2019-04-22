package com.dominika.dojo;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    static String solution(int[] arr) {
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

}

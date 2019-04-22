package com.dominika.dojo;

public class Staircase {

    static String solution(int n) {
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
}

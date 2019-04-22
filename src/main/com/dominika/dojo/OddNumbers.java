package com.dominika.dojo;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    static List<Integer> solution(int l, int r) {
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
}

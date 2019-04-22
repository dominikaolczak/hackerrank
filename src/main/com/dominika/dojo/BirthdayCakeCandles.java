package com.dominika.dojo;

import java.util.HashMap;
import java.util.Map;

public class BirthdayCakeCandles {

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
}

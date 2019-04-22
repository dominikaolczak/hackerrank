package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayCakeCandlesTest {

    @Test
    public void birthdayCakeCandles() {
        int[] array1 = {3,2,1,3};
        int blownCandels1 = Dojo.birthdayCakeCandles(array1);
        assertEquals(2, blownCandels1);

        int[] array2 = {3};
        int blownCandels2 = Dojo.birthdayCakeCandles(array2);
        assertEquals(1, blownCandels2);
    }
}

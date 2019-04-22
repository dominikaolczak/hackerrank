package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusMinusTest {

    @Test
    public void plusMunus() {
        int[] arr = {-4,3,-9,0,4,1};

        String expectedStringOutput =
                "0.5\n" +
                        "0.3333333333333333\n" +
                        "0.16666666666666666";
        assertEquals(expectedStringOutput, PlusMinus.solution(arr));
        System.out.println(PlusMinus.solution(arr)); //Because the hackerrank requires a println
    }
}

package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void diagonalDifference() {
        int[][] arr = {{11,2,4}, {4,5,6},{10,8,-12}};
        int sum = DiagonalDifference.solution(arr);

        assertEquals(15, sum);
    }
}

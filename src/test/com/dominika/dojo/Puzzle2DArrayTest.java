package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Puzzle2DArrayTest {

    @Test
    public void twoDArray() {
        int[][] positiveInputMatrix = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}};

        int expectedResult = 19;
        assertEquals(expectedResult, Puzzle2DArray.solution(positiveInputMatrix));

        int[][] zeroNegativeInputMatrix1 = {
                {-1,-1,0,-9,-2,-2},
                {-2,-1,-6,-8,-2,-5},
                {-1,-1,-1,-2,-3,-4},
                {-1,-9,-2,-4,-4,-5},
                {-7,-3,-3,-2,-9,-9},
                {-1,-3,-1,-2,-4,-5}};

        expectedResult = -6;
        assertEquals(expectedResult, Puzzle2DArray.solution(zeroNegativeInputMatrix1));

        int[][] zeroNegativeInputMatrix2 = {
                {0,-4,-6,0,-7,-6},
                {-1,-2,-6,-8,-3,-1},
                {-8,-4,-2,-8,-8,-6},
                {-3,-1,-2,-5,-7,-4},
                {-3,-5,-3,-6,-6,-6},
                {-3,-6,0,-8,-6,-7}};
        expectedResult = -19;
        assertEquals(expectedResult, Puzzle2DArray.solution(zeroNegativeInputMatrix2));
    }
}

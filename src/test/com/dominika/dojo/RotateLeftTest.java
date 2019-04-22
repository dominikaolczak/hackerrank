package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeftTest {

    @Test
    public void rotateLeft() {
        int numberOfRotations = 4;
        int[] array = {1,2,3,4,5};

        //int[] expectedArrayAfter4Rotation = {5,1,2,3,4};
        int expectedPosition1 = 5;
        int expectedPosition2 = 1;
        int expectedPosition3 = 2;
        int expectedPosition4 = 3;
        int expectedPosition5 = 4;

        int[] resultArray = RotateLeft.solution(array, numberOfRotations);

        assertEquals(expectedPosition1, resultArray[0]);
        assertEquals(expectedPosition2, resultArray[1]);
        assertEquals(expectedPosition3, resultArray[2]);
        assertEquals(expectedPosition4, resultArray[3]);
        assertEquals(expectedPosition5, resultArray[4]);
    }

}

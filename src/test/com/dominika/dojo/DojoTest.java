package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DojoTest {

    @Test
    public void minimumSwaps() {
        int[] unsortedArray1 = {1,3,5,2,4,6,7};
        int[] unsortedArray2 = {2,3,4,1,5};
        int[] unsortedArray3 = {4,3,1,2};

        int expectedSwapsforArray1 = 3;
        int expectedSwapsforArray2 = 3;
        int expectedSwapsforArray3 = 3;

        //assertEquals(expectedSwapsforArray1, Dojo.minimumSwaps(unsortedArray1));
        assertEquals(expectedSwapsforArray2, Dojo.minimumSwaps(unsortedArray2));
        assertEquals(expectedSwapsforArray3, Dojo.minimumSwaps(unsortedArray3));
    }

    @Test
    public void formingMagicSquare() {
        /*int[][] square1 = {{4,9,2},{3,5,7},{8,1,5}};
        assertEquals(1, Dojo.formingMagicSquare(square1));

        int[][] square2 = {{4,8,2},{4,5,7},{6,1,6}};
        assertEquals(4, Dojo.formingMagicSquare(square2));

        int[][] square3 = {{4,5,8},{2,4,1},{1,9,7}};
        assertEquals(14, Dojo.formingMagicSquare(square3));

        int[][] square4 = {{2,9,8},{4,2,7},{5,6,7}};
        assertEquals(21, Dojo.formingMagicSquare(square4));*/

        //int[][] square5 = {{2,2,7}, {8,6,4},{1,2,9}};
        //assertEquals(16, Dojo.formingMagicSquare(square5));

        int[][] square6 = {{4,6,6},{2,4,1},{8,9,8}};
        assertEquals(21, Dojo.formingMagicSquare(square6));

        /*9 2 4
        7 3 3
        4 3 8
        20*/

        /*4 9 2
        9 7 6
        3 5 8
        18 */
    }


}


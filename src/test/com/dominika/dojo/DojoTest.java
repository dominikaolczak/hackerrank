package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DojoTest {

    @Test
    public void rotLeft() {
        int numberOfRotations = 4;
        int[] array = {1,2,3,4,5};

        int[] expectedArrayAfter4Rotation = {5,1,2,3,4};
        int expectedPosition1 = 5;
        int expectedPosition2 = 1;
        int expectedPosition3 = 2;
        int expectedPosition4 = 3;
        int expectedPosition5 = 4;

        int[] resultArray = Dojo.rotLeft(array, numberOfRotations);

        assertEquals(expectedPosition1, resultArray[0]);
        assertEquals(expectedPosition2, resultArray[1]);
        assertEquals(expectedPosition3, resultArray[2]);
        assertEquals(expectedPosition4, resultArray[3]);
        assertEquals(expectedPosition5, resultArray[4]);
    }

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
    public void oddNumbers() {
        List<Integer> result6 = Dojo.oddNumbers(3,9);
        List<Integer> expectedResult6 = new ArrayList<>();
        expectedResult6.add(new Integer(3));
        expectedResult6.add(new Integer(5));
        expectedResult6.add(new Integer(7));
        expectedResult6.add(new Integer(9));

        assertEquals(expectedResult6, result6);

        List<Integer> result1 = Dojo.oddNumbers(2,5);
        List<Integer> expectedResult1 = new ArrayList<>();
        expectedResult1.add(new Integer(3));
        expectedResult1.add(new Integer(5));

        assertEquals(expectedResult1, result1);

        List<Integer> result2 = Dojo.oddNumbers(2,9);
        List<Integer> expectedResult2 = new ArrayList<>();
        expectedResult2.add(new Integer(3));
        expectedResult2.add(new Integer(5));
        expectedResult2.add(new Integer(7));
        expectedResult2.add(new Integer(9));

        assertEquals(expectedResult2, result2);

        List<Integer> result3 = Dojo.oddNumbers(96,97);
        List<Integer> expectedResult3 = new ArrayList<>();
        expectedResult3.add(new Integer(97));

        assertEquals(expectedResult3, result3);

        List<Integer> result4 = Dojo.oddNumbers(96,96);
        List<Integer> expectedResult4 = new ArrayList<>();

        assertEquals(expectedResult4, result4);

        List<Integer> result5 = Dojo.oddNumbers(97,97);
        List<Integer> expectedResult5 = new ArrayList<>();
        expectedResult5.add(new Integer(97));

        assertEquals(expectedResult5, result5);
    }

    @Test
    public void insertionSort1() {
        int[] arrayToSort1 = {2,4,6,8,3};

        List<Integer> firstIteration = new ArrayList();
        firstIteration.add(2);
        firstIteration.add(4);
        firstIteration.add(6);
        firstIteration.add(8);
        firstIteration.add(8);

        List<Integer> secondIteration = new ArrayList();
        secondIteration.add(2);
        secondIteration.add(4);
        secondIteration.add(6);
        secondIteration.add(6);
        secondIteration.add(8);

        List<Integer> thirdIteration = new ArrayList();
        thirdIteration.add(2);
        thirdIteration.add(4);
        thirdIteration.add(4);
        thirdIteration.add(6);
        thirdIteration.add(8);

        List<Integer> forthIteration = new ArrayList();
        forthIteration.add(2);
        forthIteration.add(3);
        forthIteration.add(4);
        forthIteration.add(6);
        forthIteration.add(8);

        Map<Integer, List<Integer>> result = Dojo.insertionSort1(5, arrayToSort1);
        assertTrue(firstIteration.equals(result.get(1)));
        assertTrue(secondIteration.equals(result.get(2)));
        assertTrue(thirdIteration.equals(result.get(3)));
        assertTrue(forthIteration.equals(result.get(4)));

        int[] arrayToSort2 = {2};
        Map<Integer, List<Integer>> result2 = Dojo.insertionSort1(1, arrayToSort2);
        List<Integer> firstIteration1 = new ArrayList();
        firstIteration1.add(2);
        assertTrue(firstIteration1.equals(result2.get(0)));
    }

    @Test
    public void miniMaxSum() {
        int[] array1 = {1,3,5,7,9};

        List<Long> result1 = Dojo.miniMaxSum(array1);
        assertEquals(16,result1.get(0));
        assertEquals(24,result1.get(1));

        int[] array2 = {1,2,3,4,5};
        List<Long> result2 = Dojo.miniMaxSum(array2);
        assertEquals(10,result2.get(0));
        assertEquals(14,result2.get(1));

        int[] array3 = {7,69,2,221,8974};
        List<Long> result3 = Dojo.miniMaxSum(array3);
        assertEquals(299L,result3.get(0));
        assertEquals(9271L,result3.get(1));

        int[] array4 = {256741038,623958417,467905213,714532089,938071625};
        List<Long> result4 = Dojo.miniMaxSum(array4);
        assertEquals(2063136757L,result4.get(0));
        assertEquals(2744467344L,result4.get(1));

        int[] array5 = {396285104,573261094,759641832,819230764,364801279};
        List<Long> result5 = Dojo.miniMaxSum(array5);
        assertEquals(2093989309L,result5.get(0));
        assertEquals(2548418794L,result5.get(1));

    }

    @Test
    public void birthdayCakeCandles() {
        int[] array1 = {3,2,1,3};
        int blownCandels1 = Dojo.birthdayCakeCandles(array1);
        assertEquals(2, blownCandels1);

        int[] array2 = {3};
        int blownCandels2 = Dojo.birthdayCakeCandles(array2);
        assertEquals(1, blownCandels2);
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


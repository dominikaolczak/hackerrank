package com.dominika.dojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.dominika.dojo.Dojo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DojoTest {

    @Test
    public void diagonalDifference() {
        int[][] arr = {{11,2,4}, {4,5,6},{10,8,-12}};
        int sum = Dojo.diagonalDifference(arr);

        assertEquals(15, sum);
    }

    @Test
    public void compareTriplets() {

    }

    @Test
    public void plusMunus() {
        int[] arr = {-4,3,-9,0,4,1};

        String expectedStringOutput =
                        "0.5\n" +
                        "0.3333333333333333\n" +
                        "0.16666666666666666";
        assertEquals(expectedStringOutput, Dojo.plusMinus(arr));
        System.out.println(Dojo.plusMinus(arr));
    }

    @Test
    public void staircase() {
        String expectedStaircase =
                        "     #" + "\n" +
                        "    ##" + "\n" +
                        "   ###" + "\n" +
                        "  ####" + "\n" +
                        " #####" + "\n" +
                        "######";
        String staircase = Dojo.staircase(6);
        assertEquals(expectedStaircase, staircase);
        System.out.println(staircase);
    }

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
        assertEquals(expectedResult, Dojo.hourglassSum(positiveInputMatrix));

        int[][] zeroNegativeInputMatrix1 = {
                {-1,-1,0,-9,-2,-2},
                {-2,-1,-6,-8,-2,-5},
                {-1,-1,-1,-2,-3,-4},
                {-1,-9,-2,-4,-4,-5},
                {-7,-3,-3,-2,-9,-9},
                {-1,-3,-1,-2,-4,-5}};

        expectedResult = -6;
        assertEquals(expectedResult, Dojo.hourglassSum(zeroNegativeInputMatrix1));

        int[][] zeroNegativeInputMatrix2 = {
                {0,-4,-6,0,-7,-6},
                {-1,-2,-6,-8,-3,-1},
                {-8,-4,-2,-8,-8,-6},
                {-3,-1,-2,-5,-7,-4},
                {-3,-5,-3,-6,-6,-6},
                {-3,-6,0,-8,-6,-7}};
        expectedResult = -19;
        assertEquals(expectedResult, Dojo.hourglassSum(zeroNegativeInputMatrix2));
    }

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
    public void minimumBribes() {
        int[] bribeQueue1 = {2,1,5,3,4};
        int[] bribeQueue2 = {2,5,1,3,4};
        int[] bribeQueue3 = {2,1,3,4,5,6,7,8,9,10,11,13,12,15,16,14};
        int[] bribeQueue4 = {5,1,2,3,7,8,6,4};
        int[] bribeQueue5 = {1,2,5,3,7,8,6,4};
        int[] longBribeQueue = get1000valueArray();

        String expectedMinimumBribesForBribeQueue1 = "3";
        String expectedMinimumBribesForBribeQueue3 = "4";
        String expectedMinimumBribesForBribeQueue5 = "7";
        String tooCaoticExpectation = "Too chaotic";
        String expectedMinimumBribesForBribeLongQueue = "966";

        assertEquals(expectedMinimumBribesForBribeQueue1, Dojo.minimumBribes(bribeQueue1));
        assertEquals(tooCaoticExpectation, Dojo.minimumBribes(bribeQueue2));
        assertEquals(expectedMinimumBribesForBribeQueue3, Dojo.minimumBribes(bribeQueue3));
        assertEquals(tooCaoticExpectation, Dojo.minimumBribes(bribeQueue4));
        assertEquals(expectedMinimumBribesForBribeQueue5, Dojo.minimumBribes(bribeQueue5));
        assertEquals(expectedMinimumBribesForBribeLongQueue, Dojo.minimumBribes(longBribeQueue));
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





    private int[] get1000valueArray() {
        int[] array = {
                2,1,5,6,3,4,9,8,11,7,10,14,13,12,17,16,15,19,18,22,
                20,24,23,21,27,28,25,26,30,29,33,32,31,35,36,34,39,38,37,42,
                40,44,41,43,47,46,48,45,50,52,49,51,54,56,55,53,59,58,57,61,
                63,60,65,64,67,68,62,69,66,72,70,74,73,71,77,75,79,78,81,82,
                80,76,85,84,83,86,89,90,88,87,92,91,95,94,93,98,97,100,96,102,
                99,104,101,105,103,108,106,109,107,112,111,110,113,116,114,118,119,117,115,122,
                121,120,124,123,127,125,126,130,129,128,131,133,135,136,132,134,139,140,138,137,
                143,141,144,146,145,142,148,150,147,149,153,152,155,151,157,154,158,159,156,161,
                160,164,165,163,167,166,162,170,171,172,168,169,175,173,174,177,176,180,181,178,
                179,183,182,184,187,188,185,190,189,186,191,194,192,196,197,195,199,193,198,202,
                200,204,205,203,207,206,201,210,209,211,208,214,215,216,212,218,217,220,213,222,
                219,224,221,223,227,226,225,230,231,229,228,234,235,233,237,232,239,236,241,238,
                240,243,242,246,245,248,249,250,247,244,253,252,251,256,255,258,254,257,259,261,
                262,263,265,264,260,268,266,267,271,270,273,269,274,272,275,278,276,279,277,282,
                283,280,281,286,284,288,287,290,289,285,293,291,292,296,294,298,297,299,295,302,
                301,304,303,306,300,305,309,308,307,312,311,314,315,313,310,316,319,318,321,320,
                317,324,325,322,323,328,327,330,326,332,331,329,335,334,333,336,338,337,341,340,
                339,344,343,342,347,345,349,346,351,350,348,353,355,352,357,358,354,356,359,361,
                360,364,362,366,365,363,368,370,367,371,372,369,374,373,376,375,378,379,377,382,
                381,383,380,386,387,384,385,390,388,392,391,389,393,396,397,394,398,395,401,400,
                403,402,399,405,407,406,409,408,411,410,404,413,412,415,417,416,414,420,419,422,
                421,418,424,426,423,425,428,427,431,430,429,434,435,436,437,432,433,440,438,439,
                443,441,445,442,447,444,448,446,449,452,451,450,455,453,454,457,456,460,459,458,
                463,462,464,461,467,465,466,470,469,472,468,474,471,475,473,477,476,480,479,478,
                483,482,485,481,487,484,489,490,491,488,492,486,494,495,496,498,493,500,499,497,
                502,504,501,503,507,506,505,509,511,508,513,510,512,514,516,518,519,515,521,522,
                520,524,517,523,525,526,529,527,531,528,533,532,534,530,537,536,539,535,541,538,
                540,543,544,542,547,548,545,549,546,552,550,551,554,553,557,555,556,560,559,558,
                563,562,564,561,567,568,566,565,569,572,571,570,575,574,577,576,579,573,580,578,
                583,581,584,582,587,586,585,590,589,588,593,594,592,595,591,598,599,596,597,602,
                603,604,605,600,601,608,609,607,611,612,606,610,615,616,614,613,619,618,617,622,
                620,624,621,626,625,623,628,627,631,630,633,629,635,632,637,636,634,638,640,642,
                639,641,645,644,647,643,646,650,648,652,653,654,649,651,656,658,657,655,661,659,
                660,663,664,666,662,668,667,670,665,671,673,669,672,676,677,674,679,675,680,678,
                681,684,682,686,685,683,689,690,688,687,693,692,691,696,695,698,694,700,701,702,
                697,704,699,706,703,705,709,707,711,712,710,708,713,716,715,714,718,720,721,719,
                723,717,722,726,725,724,729,728,727,730,733,732,735,734,736,731,738,737,741,739,
                740,744,743,742,747,746,745,750,748,752,749,753,751,756,754,758,755,757,761,760,
                759,764,763,762,767,765,768,766,771,770,769,774,773,776,772,778,777,779,775,781,
                780,783,784,782,786,788,789,787,790,785,793,791,792,796,795,794,798,797,801,799,
                803,800,805,802,804,808,806,807,811,809,810,814,812,813,817,816,819,818,815,820,
                821,823,822,824,826,827,825,828,831,829,830,834,833,836,832,837,839,838,841,835,
                840,844,842,846,845,843,849,847,851,850,852,848,855,854,853,857,856,858,861,862,
                860,859,863,866,865,864,867,870,869,868,872,874,875,871,873,877,878,876,880,881,
                879,884,883,885,882,888,886,890,891,889,893,887,895,892,896,898,894,899,897,902,
                901,903,905,900,904,908,907,910,909,906,912,911,915,913,916,918,914,919,921,917,
                923,920,924,922,927,925,929,928,926,932,931,934,930,933,935,937,939,940,938,936,
                943,944,942,941,947,946,948,945,951,950,949,953,952,956,954,958,957,955,961,962,
                963,959,964,966,960,965,969,968,971,967,970,974,972,976,973,975,979,977,981,982,
                978,980,983,986,984,985,989,988,987,990,993,991,995,994,997,992,999,1000,996,998};
        return array;
    }

}


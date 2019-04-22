package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxSumTest {

    @Test
    public void miniMaxSum() {
        int[] array1 = {1,3,5,7,9};

        List<Long> result1 = MinMaxSum.solution(array1);
        assertEquals(16,result1.get(0));
        assertEquals(24,result1.get(1));

        int[] array2 = {1,2,3,4,5};
        List<Long> result2 = MinMaxSum.solution(array2);
        assertEquals(10,result2.get(0));
        assertEquals(14,result2.get(1));

        int[] array3 = {7,69,2,221,8974};
        List<Long> result3 = MinMaxSum.solution(array3);
        assertEquals(299L,result3.get(0));
        assertEquals(9271L,result3.get(1));

        int[] array4 = {256741038,623958417,467905213,714532089,938071625};
        List<Long> result4 = MinMaxSum.solution(array4);
        assertEquals(2063136757L,result4.get(0));
        assertEquals(2744467344L,result4.get(1));

        int[] array5 = {396285104,573261094,759641832,819230764,364801279};
        List<Long> result5 = MinMaxSum.solution(array5);
        assertEquals(2093989309L,result5.get(0));
        assertEquals(2548418794L,result5.get(1));

    }
}

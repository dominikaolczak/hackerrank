package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddNumbersTest {

    @Test
    public void oddNumbers() {
        List<Integer> result6 = OddNumbers.solution(3,9);
        List<Integer> expectedResult6 = new ArrayList<>();
        expectedResult6.add(new Integer(3));
        expectedResult6.add(new Integer(5));
        expectedResult6.add(new Integer(7));
        expectedResult6.add(new Integer(9));

        assertEquals(expectedResult6, result6);

        List<Integer> result1 = OddNumbers.solution(2,5);
        List<Integer> expectedResult1 = new ArrayList<>();
        expectedResult1.add(new Integer(3));
        expectedResult1.add(new Integer(5));

        assertEquals(expectedResult1, result1);

        List<Integer> result2 = OddNumbers.solution(2,9);
        List<Integer> expectedResult2 = new ArrayList<>();
        expectedResult2.add(new Integer(3));
        expectedResult2.add(new Integer(5));
        expectedResult2.add(new Integer(7));
        expectedResult2.add(new Integer(9));

        assertEquals(expectedResult2, result2);

        List<Integer> result3 = OddNumbers.solution(96,97);
        List<Integer> expectedResult3 = new ArrayList<>();
        expectedResult3.add(new Integer(97));

        assertEquals(expectedResult3, result3);

        List<Integer> result4 = OddNumbers.solution(96,96);
        List<Integer> expectedResult4 = new ArrayList<>();

        assertEquals(expectedResult4, result4);

        List<Integer> result5 = OddNumbers.solution(97,97);
        List<Integer> expectedResult5 = new ArrayList<>();
        expectedResult5.add(new Integer(97));

        assertEquals(expectedResult5, result5);
    }
}

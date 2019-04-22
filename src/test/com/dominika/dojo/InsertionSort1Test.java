package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertionSort1Test {

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

        Map<Integer, List<Integer>> result = InsertionSort1.solution(5, arrayToSort1);
        assertTrue(firstIteration.equals(result.get(1)));
        assertTrue(secondIteration.equals(result.get(2)));
        assertTrue(thirdIteration.equals(result.get(3)));
        assertTrue(forthIteration.equals(result.get(4)));

        int[] arrayToSort2 = {2};
        Map<Integer, List<Integer>> result2 = InsertionSort1.solution(1, arrayToSort2);
        List<Integer> firstIteration1 = new ArrayList();
        firstIteration1.add(2);
        assertTrue(firstIteration1.equals(result2.get(0)));
    }

}

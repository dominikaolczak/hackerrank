package com.dominika.dojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaircaseTest {
    @Test
    public void staircase() {
        String expectedStaircase =
                "     #" + "\n" +
                        "    ##" + "\n" +
                        "   ###" + "\n" +
                        "  ####" + "\n" +
                        " #####" + "\n" +
                        "######";
        String staircase = Staircase.solution(6);
        assertEquals(expectedStaircase, staircase);
        System.out.println(staircase);
    }
}

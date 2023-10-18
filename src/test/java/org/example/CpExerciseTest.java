package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpExerciseTest {

    @Test
    void possibleTripImpossibleTrip() {

       boolean expected = CpExercise.possibleTrip(12,44,25,0);
        assertFalse(expected);
    }

    @Test
    void possibleTripImpossibleTripV2() {

        boolean expected = CpExercise.possibleTrip(12,44,24,1);
        assertFalse(expected);
    }

    @Test
    void possibleTripImpossibleTripV3() {

        boolean expected = CpExercise.possibleTrip(-12,44,23,1);
        assertFalse(expected);
    }

    @Test
    void possibleTripImpossibleTripMinutes() {

        boolean expected = CpExercise.possibleTrip(12,77,23,1);
        assertFalse(expected);
    }

    @Test
    void possibleTripImpossibleTripMinutesV2() {

        boolean expected = CpExercise.possibleTrip(12,7,23,60);
        assertFalse(expected);
    }

    @Test
    void possibleTripInvalidDuration() {

        boolean expected = CpExercise.possibleTrip(12,7,0,0);
        assertFalse(expected);
    }

    @Test
    void possibleTripBorderLinePossibleTrip() {

        boolean expected = CpExercise.possibleTrip(0,44,24,0);
        assertTrue(expected);
    }

    @Test
    void possibleTripPossibleTrip() {

        boolean expected = CpExercise.possibleTrip(0,44,9,8);
        assertTrue(expected);
    }

    @Test
    void cpTripAnalysisPossibleTripFD() {
        String expected = CpExercise.CpTripAnalysis(20,10,10,50);
        assertEquals(expected,"Arrival at --> " + 7 + ":" + 0 + " of the following day");
    }


    @Test
    void cpTripAnalysisPossibleTripV2FD() {
        String expected = CpExercise.CpTripAnalysis(24,0,10,50);
        assertEquals(expected,"Arrival at --> " + 10 + ":" + 50 + " of the following day");
    }

    @Test
    void cpTripAnalysisPossibleTripV3FD() {
        String expected = CpExercise.CpTripAnalysis(15,2,8,59);
        assertEquals(expected,"Arrival at --> " + 0 + ":" + 1 + " of the following day");
    }


    @Test
    void cpTripAnalysisPossibleTripSD() {
        String expected = CpExercise.CpTripAnalysis(16,9,5,50);
        assertEquals(expected,"Arrival at --> " + 21 + ":" + 59 + " of the same day");
    }

    @Test
    void cpTripAnalysisPossibleTripSDV2() {
        String expected = CpExercise.CpTripAnalysis(16,9,5,51);
        assertEquals(expected,"Arrival at --> " + 22 + ":" + 0 + " of the same day");
    }

    @Test
    void cpTripAnalysisImpossibleTrip() {
        String expected = CpExercise.CpTripAnalysis(24,66,5,1);
        assertEquals(expected,"Impossible trip.");
    }
}
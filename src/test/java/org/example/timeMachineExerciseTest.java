package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class timeMachineExerciseTest {

    @Test
    void ImpossibleTimingZeroDuration() {
        boolean expected = timeMachineExercise.possibleTiming(12,45,50,0);
        assertFalse(expected);
    }

    @Test
    void ImpossibleTimingMaxedOutPartueTiming() {
        boolean expected = timeMachineExercise.possibleTiming(24,1,0,99);
        assertFalse(expected);
    }

    @Test
    void ImpossibleTimingMaxedOutPartueTimingV2() {
        boolean expected = timeMachineExercise.possibleTiming(24,0,1,99);
        assertFalse(expected);
    }


    @Test
    void ImpossibleTimingNegDuration() {
        boolean expected = timeMachineExercise.possibleTiming(12,45,50,-8);
        assertFalse(expected);
    }

    @Test
    void ImpossibleTimingMaxOutDepartMinuts() {
        boolean expected = timeMachineExercise.possibleTiming(12,60,50,6);
        assertFalse(expected);
    }


    @Test
    void possibleTiming() {
        boolean expected = timeMachineExercise.possibleTiming(23,59,50,3600);
        assertTrue(expected);
    }

    @Test
    void workAnalysisPossibleBorderLine() {
        String expected = timeMachineExercise.workAnalysis(16,59,59,61);
        assertEquals(expected,"Hora de termino do serviço: " + 17 + ":" + 1 + ":" + 0);
    }

    @Test
    void workAnalysisPossibleBorderLineV2() {
        String expected = timeMachineExercise.workAnalysis(23,59,59,61);
        assertEquals(expected,"Hora de termino do serviço: " + 0 + ":" + 1 + ":" + 0);
    }

    @Test
    void workAnalysisPossible() {
        String expected = timeMachineExercise.workAnalysis(15,12,20,3760);
        assertEquals(expected,"Hora de termino do serviço: " + 16 + ":" + 15 + ":" + 0);
    }

    @Test
    void workAnalysisImPossible() {
        String expected = timeMachineExercise.workAnalysis(23,14,78,61);
        assertEquals(expected,"Impossible trip.");
    }
}
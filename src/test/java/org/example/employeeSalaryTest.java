package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeSalaryTest {

    @Test
    void employSalaryCalc() {
        double expected = employeeSalary.employSalaryCalc(60);
        assertEquals(expected,605);
    }

    @Test
    void employSalaryCalcV2() {
        double expected = employeeSalary.employSalaryCalc(36);
        assertEquals(expected,270);
    }

    @Test
    void employSalaryCalcV3() {
        double expected = employeeSalary.employSalaryCalc(41);
        assertEquals(expected,320);
    }

    @Test
    void employSalaryCalcImpossible() {
        double expected = employeeSalary.employSalaryCalc(34);
        assertEquals(expected,-1);
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleExerciseTest {

    @org.junit.jupiter.api.Test
    void isTriangleImpossibleNegValues() {
        boolean expeceted = TriangleExercise.isTrianglePossible(-9,7,5);
        assertFalse(expeceted);
    }


    @org.junit.jupiter.api.Test
    void isTriangleImpossibleInvalidValues() {
        boolean expeceted = TriangleExercise.isTrianglePossible(7,10,1);
        assertFalse(expeceted);
    }

    @org.junit.jupiter.api.Test
    void isTriangleImpossibleInvalidValuesV2() {
        boolean expeceted = TriangleExercise.isTrianglePossible(7,20,9);
        assertFalse(expeceted);
    }

    @org.junit.jupiter.api.Test
    void isTrianglePossibleInvalidValues() {
        boolean expeceted = TriangleExercise.isTrianglePossible(8.5,3.0,6.4);
        assertTrue(expeceted);
    }


    @org.junit.jupiter.api.Test
    void isTrianglePossibleInvalidValuesV2() {
        boolean expeceted = TriangleExercise.isTrianglePossible(10,9,2);
        assertTrue(expeceted);
    }

    @Test
    void typeofTriangleImpossible() {
        String expected = TriangleExercise.typeofTriangle(10,1,13);
        assertEquals("Impossible triangle",expected);
    }

    @Test
    void typeofTriangleImpossibleNegValue() {
        String expected = TriangleExercise.typeofTriangle(-8,1,13);
        assertEquals("Impossible triangle",expected);
    }

    @Test
    void typeofTriangleEscalene() {
        String expected = TriangleExercise.typeofTriangle(10,9,11);
        assertEquals("Scalene",expected);
    }

    @Test
    void typeofTriangleEquilateral() {
        String expected = TriangleExercise.typeofTriangle(10,10,10);
        assertEquals("Equilateral",expected);
    }

    @Test
    void typeofTriangleIsosceles() {
        String expected = TriangleExercise.typeofTriangle(11,11,10);
        assertEquals("Isosceles",expected);
    }

    @Test
    void isTrianglePossibleAngleNegAngle() {
         boolean expected = TriangleExercise.isTrianglePossibleAngle(-9,120,40);
         assertFalse(expected);
    }

    @Test
    void isTrianglePossibleAngleInfo180() {
        boolean expected = TriangleExercise.isTrianglePossibleAngle(100,40,35);
        assertFalse(expected);
    }

    @Test
    void isTrianglePossibleAngle() {
        boolean expected = TriangleExercise.isTrianglePossibleAngle(90,50,40);
        assertTrue(expected);
    }

    @Test
    void typeofTriangleAngleAcuntangulo() {
        String expected = TriangleExercise.typeofTriangleAngle(70,60,50);
        assertEquals("Acutangulo",expected);
    }

    @Test
    void typeofTriangleAngleReto() {
        String expected = TriangleExercise.typeofTriangleAngle(90,45,45);
        assertEquals("Triangulo reto",expected);
    }

    @Test
    void typeofTriangleAngleObtuso() {
        String expected = TriangleExercise.typeofTriangleAngle(100,20,60);
        assertEquals("Triangulo obtuso",expected);
    }

    @Test
    void typeofTriangleAngleImpossible() {
        String expected = TriangleExercise.typeofTriangleAngle(100,60,19.9);
        assertEquals("Triangulo impossivel.",expected);
    }
}
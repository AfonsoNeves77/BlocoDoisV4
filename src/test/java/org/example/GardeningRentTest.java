package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardeningRentTest {

    @Test
    void rentingMaterialNegDistance() {
        double expected = GardeningRent.rentingMaterialGarden("a","terca", -6);
        assertEquals(-2,expected);
    }

    @Test
    void rentingMaterialDefaultValueKit() {
        double expected = GardeningRent.rentingMaterialGarden("k","terca", 6);
        assertEquals(-3,expected);
    }


    @Test
    void rentingMaterialDefaultValueDayOfWeek() {
        double expected = GardeningRent.rentingMaterialGarden("b","x", 6);
        assertEquals(-1,expected);
    }


    @Test
    void rentingMaterialDefaultValueSpecialDay() {
        double expected = GardeningRent.rentingMaterialGarden("k","feriado", 6);
        assertEquals(-3,expected);
    }


    @Test
    void rentingMaterialGardenPossibleValues() {
        double expected = GardeningRent.rentingMaterialGarden("b","quarta", 4);
        assertEquals(58.0,expected);
    }

    @Test
    void rentingMaterialGardenPossibleValuesV2() {
        double expected = GardeningRent.rentingMaterialGarden("a","terca", 7.5);
        assertEquals(45.0,expected);
    }

    @Test
    void rentingMaterialGardenPossibleValuesV3() {
        double expected = GardeningRent.rentingMaterialGarden("c","sexta", 2.5);
        assertEquals(105.0,expected);
    }

    @Test
    void rentingMaterialGardenSaturday() {
        double expected = GardeningRent.rentingMaterialGarden("b","sabado", 2);
        assertEquals(74.0,expected);
    }

    @Test
    void rentingMaterialGardenSunday() {
        double expected = GardeningRent.rentingMaterialGarden("c","domingo", 10);
        assertEquals(160.0,expected);
    }

    @Test
    void rentingMaterialGardenHoliday() {
        double expected = GardeningRent.rentingMaterialGarden("a","feriado", 7);
        assertEquals(54.0,expected);
    }
}
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {
    Car carCorrect;
    Car carCorrect1;
    Car carIncorrect;
    CarInspectionService carInspectionService;
    @BeforeEach
    void setUp() {
        carCorrect = new Car(4, 3, true, true);
        carCorrect1 = new Car(4, 5, true, true);
        carIncorrect = new Car(5, 0, false, false);
        carInspectionService = new CarInspectionService();
    }
    @Test
    public void test_hasFourTires_true() {
        assertTrue(carInspectionService.hasFourTires(carCorrect));
    }
    @Test
    public void test_hasFourTires_false() {
        assertFalse(carInspectionService.hasFourTires(carIncorrect));
    }
    @Test
    public void test_hasSeatBelt_true() {
        assertTrue(carInspectionService.hasSeatBelt(carCorrect));
    }
    @Test
    public void test_hasSeatBelt_false() {
        assertFalse(carInspectionService.hasSeatBelt(carIncorrect));
    }
    @Test
    public void test_hasAirBag_true() {
        assertTrue(carInspectionService.hasAirBag(carCorrect));
    }
    @Test
    public void test_hasAirBag_false() {
        assertFalse(carInspectionService.hasAirBag(carIncorrect));
    }
    @Test
    public void test_hasThreeOrFiveDoors_trueForCarWithThreeDoors() {
        assertTrue(carInspectionService.hasThreeOrFiveDoors(carCorrect));
    }
    @Test
    public void test_hasThreeOrFiveDoors_trueForCarWithFiveDoors() {
        assertTrue(carInspectionService.hasThreeOrFiveDoors(carCorrect1));
    }
    @Test
    public void test_hasThreeOrFiveDoors_falseForCarWithZeroDoors() {
        assertFalse(carInspectionService.hasThreeOrFiveDoors(carIncorrect));
    }
    @Test
    public void test_checkCar_trueForCarWithThreeDoors() {
        assertTrue(carInspectionService.checkCar(carCorrect));
    }
    @Test
    public void test_checkCar_trueForCarWithFiveDoors() {
        assertTrue(carInspectionService.checkCar(carCorrect1));
    }
    @Test
    public void test_checkCar_falseForCarWithZeroDoors() {
        assertFalse(carInspectionService.checkCar(carIncorrect));
    }
}
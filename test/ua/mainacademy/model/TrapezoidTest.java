package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {

    @Test
    void getArea() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setHeight(10);
        trapezoid.setLowerBase(30);
        trapezoid.setUpperBase(20);
        assertEquals(((30 + 20) / 2) * 10, trapezoid.getArea());
    }
}
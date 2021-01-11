package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {

    @Test
    void getArea() {
        Rhombus rhombus = new Rhombus();
        rhombus.setSide(30);
        assertEquals(30 * 30, rhombus.getArea());
    }
}
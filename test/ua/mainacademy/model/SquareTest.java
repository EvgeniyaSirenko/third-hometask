package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    //testing git

    @Test
    void getArea() {
        Square square = new Square();
        square.setSide(15);
        assertEquals(15 * 15, square.getArea());
    }
}
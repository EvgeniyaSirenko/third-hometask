package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void compareTo() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(20);
        rectangle.setWeight(10);
        assertEquals(20 * 10, rectangle.getArea());
    }
}
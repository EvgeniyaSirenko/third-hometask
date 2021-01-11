package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle();
        triangle.setBase(15);
        triangle.setHeight(20);
        assertEquals((15 * 20) / 2, triangle.getArea());
    }
}
package ua.mainacademy.model;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle();
        circle.setRadius(20);
        double result = circle.getArea();
        assertEquals(Math.PI * 20 * 20, result);
    }
}
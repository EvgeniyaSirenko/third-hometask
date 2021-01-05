package ua.mainacademy;

import ua.mainacademy.model.*;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class AppRunner {
    private static final Logger LOG = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Square square1 = new Square(30);
        Square square2 = new Square(25);
        Square square3 = new Square(11);

        Triangle triangle1 = new Triangle(20, 15);
        Triangle triangle2 = new Triangle(30, 25);
        Triangle triangle3 = new Triangle(40, 30);

        Rhombus rhombus1 = new Rhombus(20);
        Rhombus rhombus2 = new Rhombus(10);
        Rhombus rhombus3 = new Rhombus(15);

        Rectangle rectangle1 = new Rectangle(15, 10);
        Rectangle rectangle2 = new Rectangle(20, 10);
        Rectangle rectangle3 = new Rectangle(25, 10);

        Trapezoid trapezoid1 = new Trapezoid(15, 25, 10);
        Trapezoid trapezoid2 = new Trapezoid(20, 35, 10);
        Trapezoid trapezoid3 = new Trapezoid(25, 45, 10);

        Set<Shape> shapes = new TreeSet<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(triangle3);
        shapes.add(rhombus1);
        shapes.add(rhombus2);
        shapes.add(rhombus3);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(rectangle3);
        shapes.add(trapezoid1);
        shapes.add(trapezoid2);
        shapes.add(trapezoid3);

        for (Shape shape : shapes) {
            String name = shape.getClass().getSimpleName();
            System.out.println("Shape has area " + shape.getArea() + " and is " + name);
        }

        System.out.println("The smallest shape is " + shapes.iterator().next().getClass().getSimpleName() + " and it's area is ");

    }
}

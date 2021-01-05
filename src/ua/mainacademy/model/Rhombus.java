package ua.mainacademy.model;

public class Rhombus implements Shape{
    private double side;

    public Rhombus() {
    }

    public Rhombus(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public int compareTo(Object o) {
        Shape obj = (Shape) o;
        if (this.getArea() > obj.getArea()) {
            return 1;
        } else if (this.getArea() < obj.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

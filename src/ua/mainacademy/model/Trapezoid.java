package ua.mainacademy.model;

public class Trapezoid implements Shape{
    private double upperBase;
    private double lowerBase;
    private double height;

    public Trapezoid() {
    }

    public Trapezoid(double upperBase, double lowerBase, double side) {
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = side;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperBase + lowerBase) / 2) * height;
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

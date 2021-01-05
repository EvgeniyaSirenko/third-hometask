package ua.mainacademy.model;

public class Rectangle implements Shape{
    private double height;
    private double weight;

    public Rectangle() {
    }

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
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

package Shapes;

public class Circle implements Shape {

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double perimeter() {
        return 2* Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                '}' + " Perimeter= "+  perimeter();
    }
}

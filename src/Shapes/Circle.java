package Shapes;

import java.text.DecimalFormat;

public class Circle implements Shape {

    public Circle(double radius)
    {
        if(radius <= 0)
            throw new IllegalArgumentException("Invalid radius!");
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
        DecimalFormat df = new DecimalFormat("0.0000");
        return "Circle{" +
                "r = " + getRadius() +
                '}' + " Perimeter= "+ df.format(perimeter());
    }
}

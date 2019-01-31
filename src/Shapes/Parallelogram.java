package Shapes;

public class Parallelogram implements Shape {
    private double width;
    private double height;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public Parallelogram(double width, double height) {

        if( width <= 0 || height <= 0)
            throw new IllegalArgumentException("Invalid side(s)");

        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return getHeight()*2 + getWidth()*2;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                '}' + " Perimeter = " + perimeter();
    }
}

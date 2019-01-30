package Shapes;

public class Parallelogram implements Shape {
    private double width;
    private double height;

    @Override
    public String toString() {
        return "Parallelogram{\" +\n" +
                "                \"width=\" + getHeight() +\n" +
                "                \", height=" + getHeight() +
                '}' + " Perimeter= " + perimeter();
    }


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
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return getHeight()*2 + getWidth()*2;
    }
}

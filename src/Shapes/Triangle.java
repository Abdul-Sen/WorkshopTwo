package Shapes;

public class Triangle extends Parallelogram {
    private double side3;

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setSide2(double side2) {
        super.setHeight(side2);
    }
    public void setSide1(double side1) {
        super.setWidth(side1);
    }


    public Triangle(double side1, double side2, double side3) {
        super(side1, side2);
        this.side3 = side3;
    }

    @Override
    public double perimeter() {
        return super.getHeight() + super.getWidth() + getSide3();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + super.getHeight()+
                "side2=" + super.getWidth() +
                "side3=" + getSide3() +
                "} Perimeter= " + perimeter();
    }

}
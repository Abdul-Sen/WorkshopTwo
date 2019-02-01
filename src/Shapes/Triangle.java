package Shapes;

import java.text.DecimalFormat;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if(side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2)
            throw new IllegalArgumentException("Invalid side!");
        if(side1 <= 0 || side2 <= 0 || side3 <= 0)
        {
            throw new IllegalArgumentException("Invalid side!");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double perimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0000");
        return "Triangle{" +
                "s1=" + side1 +
                ", s2=" + side2 +
                ", s3=" + side3 +
                '}' + " Perimeter= " + df.format(perimeter());
    }
}

//public class Triangle extends Parallelogram {
//    private double side3;
//
//    public double getSide3() {
//        return side3;
//    }
//
//    public void setSide3(double side3) {
//        this.side3 = side3;
//    }
//    public void setSide2(double side2) {
//        super.setHeight(side2);
//    }
//    public void setSide1(double side1) {
//        super.setWidth(side1);
//    }
//
//
//    public Triangle(double side1, double side2, double side3) {
//        super(side1, side2);
//        this.side3 = side3;
//    }
//
//    @Override
//    public double perimeter() {
//        return super.getHeight() + super.getWidth() + getSide3();
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "side1=" + super.getHeight()+
//                "side2=" + super.getWidth() +
//                "side3=" + getSide3() +
//                "} Perimeter= " + perimeter();
//    }
//
//}
package Shapes;

import java.text.DecimalFormat;

public class Rectangle extends Parallelogram {

    public Rectangle(double width, double height) {
        super(width, height);

    }

    public double getHeight() {
        return super.getHeight();
    }

    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0000");
        return "Rectangle{ w = " + super.getHeight() + " h= " + super.getHeight() + "} Perimeter= " + df.format(super.perimeter());
    }


}

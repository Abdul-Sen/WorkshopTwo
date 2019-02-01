package Shapes;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Parallelogram implements Shape {
    /* parallelogram's width*/
    private double width;
    /* parallelogram's height*/
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

    /**
     * Constructor accepts two doubles, width and height, throws exception if either are less than 0
     * @param width A positive double representing the width of the parallelogram
     * @param height A positive double representing the height of the parallelogram
     */
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

    /**
     *
     * @return
     */
    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.0000");
        return "Parallelogram{" +
                "w = " + getWidth() +
                ", h = " + getHeight() +
                '}' + " Perimeter = " + df.format(perimeter());
    }
}

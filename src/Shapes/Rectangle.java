package Shapes;

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
        return "Rectangle{ w = " + super.getHeight() + " h=" + super.getHeight() + "} Perimeter= " + super.perimeter();
    }


}

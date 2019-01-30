package Shapes;

public class Square extends Rectangle {

    public Square(double length) {
        super(length,length);
    }

    public void setLength(double length) {
        super.setHeight(length);
        super.setWidth(length);
    }
    public double getLength() {
        return super.getHeight();
    }

    @Override
    public String toString() {
        return "Square{ length= " + getLength() + "} Perimeter= " + super.perimeter(); //TODO: Is this OK to do? to not have a squares own perimemter function but to indicate that it has one?
    }
}

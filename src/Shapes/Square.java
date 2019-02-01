package Shapes;

public class Square extends Rectangle {

    /**
     * Constructor that accepts a positive double and creates a square of that length
     * @param length A positive double
     */
    public Square(double length)
    {
        super(length,length);
        if(length <= 0)
        {
            throw new IllegalArgumentException("Invalid side!");
        }
    }

    //getters and setters
    public void setLength(double length) {
        super.setHeight(length);
        super.setWidth(length);
    }
    public double getLength() {
        return super.getHeight(); //or getWidth, they are both same
    }

    /**
     *
     * @return Square shape object with its perimeter
     */
    @Override
    public String toString() {
        return "Square{s=" + getLength() + "} Perimeter= " + super.perimeter(); //TODO: Is this OK to do? to not have a squares own perimemter function but to indicate that it has one?
    }
}

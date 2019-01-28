package Shapes;

public class Rectangle implements Shape {


    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public float perimeter() {
        return height*2 + width *2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", height = " + height +
                '}' + " perimeter = " + perimeter();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String [] args)
    {

    }
}

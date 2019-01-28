package Shapes;

public class Triangle implements Shape {
    private int a;
    private int b;
    private int c;

    //3-Arg constructor
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Getters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    //TODO: Do we use getter or just call private vars?
    @Override
    public float perimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}' + " Perimeter= " + perimeter();
    }

//    public static void main(String [] args)
//    {
//        Triangle myTri = new Triangle(4,8,12);
//        myTri.perimeter();
//    }

}

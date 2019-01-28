package Shapes;

public class Square implements Shape {

    private int length;

    //constructor
    public Square(int length)
    {
        this.length = length;
    }

    //length getter
    public int getLength() {
        return length;
    }

    //length setter
    public void setLength(int length) {
        if(length> 0)
        {
            this.length = length;
           // throw new IndexOutOfBoundsException("hi");
        }
    }

    public float perimeter() {
        return 4*length;
    }

    @Override
    public String toString() {
        return  "Shape: Square\nLength: " + this.getLength() + "\nPerimeter: " + this.perimeter();
    }
//    public static void main(String[] args)
//    {
//        Square mySquare = new Square(5);
//        System.out.println(mySquare.perimeter());
//        System.out.println(mySquare.toString());
//    }

}
